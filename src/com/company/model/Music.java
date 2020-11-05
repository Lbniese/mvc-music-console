package com.company.model;

public class Music {

    private int musicId;
    private String name;

    public Music(int musicId, String name) {
        this.musicId = musicId;
        this.name = name;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
