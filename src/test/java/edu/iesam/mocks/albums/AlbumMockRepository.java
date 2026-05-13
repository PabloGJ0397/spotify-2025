package edu.iesam.mocks.albums;

import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.AlbumRepository;

import java.util.ArrayList;

public class AlbumMockRepository implements AlbumRepository {

    public Integer countSaveMethod = 0;
    public Integer countDeleteMethod = 0;

    @Override
    public ArrayList<Album> getAlbums() {
        ArrayList<Album> albums = new ArrayList<>();
        Album album1 = new Album("1", "Album1", "2000");
        Album album2 = new Album("2", "Album2", "2000");
        Album album3 = new Album("3", "Album3", "2000");
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        return albums;
    }

    @Override
    public void saveAlbum(Album album) {
        countSaveMethod++;
    }

    @Override
    public void deleteAlbum(String id) {
        countDeleteMethod++;
    }

    @Override
    public Album getAlbum(String id) {
        return new Album("1", "Name1", "2024");
    }
}
