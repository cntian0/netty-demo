package cn.itcast.message;

import lombok.Data;
import lombok.ToString;

/**
 * @author tiancn
 * @date 2023/3/16 19:36
 */
@Data
@ToString(callSuper = true)
public class ChatRequestMessage extends Message {
    private String content;
    private String to;
    private String from;

    public ChatRequestMessage() {
    }

    public ChatRequestMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public int getMessageType() {
        return ChatRequestMessage;
    }
}
