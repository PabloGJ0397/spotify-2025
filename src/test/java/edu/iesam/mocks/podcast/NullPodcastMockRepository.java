package edu.iesam.mocks.podcast;

import edu.iesam.features.podcast.domain.Podcast;
import edu.iesam.features.podcast.domain.PodcastRepository;

import java.util.ArrayList;

public class NullPodcastMockRepository implements PodcastRepository {
    @Override
    public ArrayList<Podcast> getPodcasts() {
        return null;
    }

    @Override
    public void savePodcast(Podcast podcast) {

    }
}
