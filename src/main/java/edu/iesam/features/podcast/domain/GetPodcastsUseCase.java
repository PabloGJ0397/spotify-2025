package edu.iesam.features.podcast.domain;

import java.util.ArrayList;

public class GetPodcastsUseCase {
    private PodcastRepository podcastRepository;

    public GetPodcastsUseCase(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }
    public ArrayList<Podcast> execute(){
        return  podcastRepository.getPodcasts();

    }
}
