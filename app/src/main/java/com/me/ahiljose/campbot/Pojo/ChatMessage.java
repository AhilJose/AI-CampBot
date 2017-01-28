package com.me.ahiljose.campbot.Pojo;

/**
 * Created by AJ on 1/28/2017.
 */
public class ChatMessage {
    private boolean isImage, isMine;
    private String content;

    public ChatMessage(String message, boolean mine) {
        content = message;
        isMine = mine;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setIsMine(boolean isMine) {
        this.isMine = isMine;
    }
}