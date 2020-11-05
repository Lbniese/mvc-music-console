package com.company.repository;

import com.company.model.Music;

public interface IMusicRepository {

    //Music retrieveMusicFromDatabase();

    Music getMusic(int id);

}
