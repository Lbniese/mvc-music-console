package com.company.repository;

import com.company.model.Music;

public class MusicRepository implements IMusicRepository {

    Music music;

    public MusicRepository() {
        music = new Music();
        music.setName("Say Something Remix");
        music.setSongId("10");
    }


    @Override
    public String getName() {
        return music.getName();
    }

    @Override
    public String getSongId() {
        return music.getSongId();
    }

    @Override
    public void setName(String name) {
        music.setName(name);
    }

    @Override
    public void setSongId(String songId) {
        music.setSongId(songId);
    }
}
