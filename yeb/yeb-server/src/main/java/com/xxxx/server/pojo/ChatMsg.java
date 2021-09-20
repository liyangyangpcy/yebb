package com.xxxx.server.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author : liyangyang
 * @date :2021/7/26/026 15:19
 * @description :消息
 * @ClassName: ChatMsg
 **/

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatMsg {

    private String from;
    private String to;
    private String content;
    private String formNickName;
    private LocalDateTime date;


}
