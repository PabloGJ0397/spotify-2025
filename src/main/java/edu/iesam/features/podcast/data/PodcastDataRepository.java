package edu.iesam.features.podcast.data;

import edu.iesam.features.podcast.domain.Podcast;
import edu.iesam.features.podcast.domain.PodcastRepository;

import java.util.ArrayList;

public class PodcastDataRepository implements PodcastRepository {
    private PodcastMemLocalDataSource podcastMemLocalDataSource;

    public PodcastDataRepository(PodcastMemLocalDataSource podcastMemLocalDataSource) {
        this.podcastMemLocalDataSource = podcastMemLocalDataSource;
    }

    @Override
    public ArrayList<Podcast> getPodcasts() {
        return podcastMemLocalDataSource.getPodcasts();
    }

    @Override
    public void savePodcast(Podcast podcast) {
        podcastMemLocalDataSource.savePodcast(podcast);

    }
}
