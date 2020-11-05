package com.company.repository;

import com.company.model.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicRepository implements IMusicRepository {

    //Music music;
    List<Music> musicList;

    public MusicRepository() {
        //music = new Music();
        //music.setName("Say Something Remix");
        //music.setSongId("10");

        musicList = new ArrayList<>();
        musicList.add(new Music(0,"Say Something (Remix)"));
        musicList.add(new Music(1,"Pump It Up"));
        musicList.add(new Music(2,"Alors on Danse"));

    }

    public Music getMusic(int id) {
        return musicList.get(id);
    }
}
