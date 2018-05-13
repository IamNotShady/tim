package auth;

import auth.starter.AuthStarter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 2016/3/2.
 */
public class Worker extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(Worker.class);
    private static Worker[] workers;

    private volatile boolean stop = false;
    private final BlockingQueue<IMHandler> _tasks = new LinkedBlockingDeque<>();

    public static void dispatch(String userId, IMHandler handler) {
        int workId = getWorkId(userId);
        if (handler == null) {
            logger.error("handler is null");
            return;
        }
        workers[workId]._tasks.offer(handler);
    }

    @Override
    public void run() {
        while (!stop) {
            IMHandler handler = null;
            try {
                handler = _tasks.poll(600, TimeUnit.MILLISECONDS);
                if (handler == null) {
                    continue;
                }
            } catch (InterruptedException e) {
                logger.error("Caught Exception");
                Thread.currentThread().interrupt();
            }
            try {
                assert handler != null;
                handler._jedis = AuthStarter.redisPoolManager.getJedis();
                handler.excute(this);
            } catch (Exception e) {
                logger.error("Caught Exception");
            } finally {
                AuthStarter.redisPoolManager.releaseJedis(handler._jedis);
                handler._jedis = null;
            }
        }
    }

    private static int getWorkId(String str) {
        return str.hashCode() % AuthStarter.workNum;
    }

    public static void startWorker(int workNum) {
        workers = new Worker[workNum];
        for (int i = 0; i < workNum; i++) {
            workers[i] = new Worker();
            workers[i].start();
        }
    }

    public static void stopWorkers() {
        for (int i = 0; i < AuthStarter.workNum; i++) {
            workers[i].stop = true;
        }
    }
}
