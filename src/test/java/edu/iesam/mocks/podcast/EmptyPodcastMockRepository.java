package edu.iesam.mocks.podcast;

import edu.iesam.features.podcast.domain.Podcast;
import edu.iesam.features.podcast.domain.PodcastRepository;

import java.util.ArrayList;

public class EmptyPodcastMockRepository  implements PodcastRepository {
    @Override
    public ArrayList<Podcast> getPodcasts() {
        return new ArrayList<>();
    }

    @Override
    public void savePodcast(Podcast podcast) {

    }
}
