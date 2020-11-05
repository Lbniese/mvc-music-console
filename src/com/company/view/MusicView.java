package com.company.view;

import com.company.model.Music;

import java.util.Scanner;

public class MusicView {

    /*
    public void printMusicDetails(String musicName, String musicSongId){
        System.out.println("Now playing: ");
        System.out.println("Song Name: " + musicName);
        System.out.println("Song Id: " + musicSongId);
    }
     */

    public void printMusicDetails(Music music) {
        System.out.println("Now playing: ");
        System.out.println(music.getName());
        System.out.println(music.getMusicId());
    }

    public int getNewMusic() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
