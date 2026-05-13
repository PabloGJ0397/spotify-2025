package edu.iesam.mocks.podcast;

import edu.iesam.features.podcast.domain.Podcast;
import edu.iesam.features.podcast.domain.PodcastRepository;

import java.util.ArrayList;
import java.util.List;

public class PodcastMockRepository implements PodcastRepository {
    public int countSaveMethod = 0;
    @Override
    public ArrayList<Podcast> getPodcasts() {
        ArrayList<Podcast> podcasts = new ArrayList<>(List.of(
                new Podcast("1A", "AAAAAA", "1A1A1A", "12345"),
                new Podcast("2A", "AAAAAA", "2A1A1A", "12345"),
                new Podcast("3A", "AAAAAA", "3A1A1A", "12345")
                ));
        return podcasts;
    }

    @Override
    public void savePodcast(Podcast podcast) { countSaveMethod++; }

}
