package edu.iesam;

import edu.iesam.features.albums.presentation.AlbumView;
import edu.iesam.features.authors.presentation.AuthorView;
import edu.iesam.features.podcast.presentation.PodcastView;
import edu.iesam.features.songs.presentation.SongView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SongView.printSongs();
        SongView.saveSong();
        SongView.deleteSong();

        AuthorView.printAuthors();
        AuthorView.saveAuthor();
        AuthorView.deleteAuthor();

        AlbumView.printAlbums();
        AlbumView.saveAlbum();
        AlbumView.deleteAlbum();

        PodcastView.getPodcast();
        PodcastView.savePodcast();

    }
}