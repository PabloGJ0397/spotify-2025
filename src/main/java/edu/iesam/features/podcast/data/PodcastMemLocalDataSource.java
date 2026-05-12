package edu.iesam.features.podcast.data;

import edu.iesam.features.podcast.domain.Podcast;

import java.util.ArrayList;

public class PodcastMemLocalDataSource {
    private static PodcastMemLocalDataSource instance;
    private ArrayList<Podcast> storage = new ArrayList<>();

    public static PodcastMemLocalDataSource getInstance(){
        if (instance==null){
            instance=new PodcastMemLocalDataSource();
        }
        return instance;
    }

    public ArrayList<Podcast> getPodcasts(){
        return storage;
    }
    public void savePodcast(Podcast podcast){
        storage.add(podcast);
    }
}
