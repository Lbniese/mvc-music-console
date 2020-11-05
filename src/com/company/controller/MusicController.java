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

    public void updateView(int id) {
        view.printMusicDetails(model.getMusic(id));
    }
}
