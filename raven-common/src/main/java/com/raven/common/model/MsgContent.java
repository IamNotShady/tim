package com.raven.common.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MsgContent implements Serializable {

    private long id;

    private String uid;

    private int type;

    private String content;

    private long time;

}
