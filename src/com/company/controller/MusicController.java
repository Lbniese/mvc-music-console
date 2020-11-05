package com.company.controller;

import com.company.repository.IMusicRepository;
import com.company.view.MusicView;

public class MusicController {

    private IMusicRepository model;
    private MusicView view;

    public MusicController(IMusicRepository model, MusicView view) {
        this.model = model;
        this.view = view;
    }

    public void setMusicName(String name) {
        model.setName(name);
    }

    public String getMusicName() {
        return model.getName();
    }

    public void setMusicSongId(String songId) {
        model.setSongId(songId);
    }

    public String getMusicSongId() {
        return model.getSongId();
    }

    public void updateView() {
        view.printMusicDetails(model.getName(), model.getSongId());
    }
}
