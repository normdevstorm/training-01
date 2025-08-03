package com.normdevstorm;

public abstract class Channel {
    private String channelId;


    public Channel(String channelId) {
        this.channelId = channelId;
    }

    public abstract void getChanelInfo();

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

}
