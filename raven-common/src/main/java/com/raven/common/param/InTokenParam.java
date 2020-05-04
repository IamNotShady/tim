package com.raven.common.param;

import lombok.Data;

/**
 * @author: bbpatience
 * @date: 2019/3/30
 * @description: GetTokenParam
 **/
@Data
public class InTokenParam {

    private String appKey;

    private String uid;

    private String deviceId;
}
