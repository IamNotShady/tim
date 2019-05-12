package com.raven.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.raven.group.restful.mapper")
public class RavenGroupApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RavenGroupApplication.class, args);
    }
}