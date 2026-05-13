package edu.iesam.mocks.albums;

import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.AlbumRepository;

import java.util.ArrayList;

public class EmptyAlbumMockRepository implements AlbumRepository {
    @Override
    public ArrayList<Album> getAlbums() {
        ArrayList<Album> albums = new ArrayList<>();
        return albums;
    }

    @Override
    public void saveAlbum(Album album) {

    }

    @Override
    public void deleteAlbum(String id) {

    }

    @Override
    public Album getAlbum(String id) {
        return null;
    }
}
