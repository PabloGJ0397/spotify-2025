package edu.iesam.features.songsrepeated.domain;

import java.util.ArrayList;

public interface SongRepository {
    public ArrayList<Song2> getSongs();
    public void saveSong(Song2 song2);
}
