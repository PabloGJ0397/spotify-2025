package edu.iesam.features.podcast.domain;

import java.util.ArrayList;

public interface PodcastRepository {
    public ArrayList<Podcast> getPodcasts();
    public void savePodcast(Podcast podcast);
}
