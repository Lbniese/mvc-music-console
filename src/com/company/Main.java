package com.company;

import com.company.controller.MusicController;
import com.company.model.Music;
import com.company.repository.IMusicRepository;
import com.company.repository.MusicRepository;
import com.company.view.MusicView;

public class Main {

    public static void main(String[] args) {
        IMusicRepository model = new MusicRepository();
        MusicView view = new MusicView();
        MusicController controller = new MusicController(model, view);

        // eventloop
        controller.updateView();
        controller.setMusicName("Say Something (Original)");
        controller.updateView();
    }

    private static Music retrieveMusicFromDatabase() {
        Music music = new Music();
        music.setName("Say Something (Remix)");
        music.setSongId("10");
        return music;
    }

}
