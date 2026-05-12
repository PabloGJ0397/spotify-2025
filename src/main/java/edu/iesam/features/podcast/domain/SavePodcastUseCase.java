package edu.iesam.features.podcast.domain;

public class SavePodcastUseCase {
    private PodcastRepository podcastRepository;

    public SavePodcastUseCase(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }

    public void execute(Podcast podcast){
        podcastRepository.savePodcast(podcast);
    }
}
