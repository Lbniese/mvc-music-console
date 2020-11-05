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
        controller.updateView(1);

        boolean eventLoop = true;
        while (eventLoop) {
            int x = view.getNewMusic();
            if (x != -1) {
                controller.updateView(x);
            } else {
                eventLoop = false;
            }

        }

    }
}
