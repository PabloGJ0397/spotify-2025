package edu.iesam.features.albums.domain;

import edu.iesam.features.albums.data.AlbumDataRepository;

import java.util.ArrayList;

public class SaveAlbumUseCase {

    private AlbumRepository albumRepository;


    public SaveAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(Album album){
        albumRepository.saveAlbum(album);
    }
}
