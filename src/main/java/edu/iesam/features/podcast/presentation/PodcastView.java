package edu.iesam.features.podcast.presentation;

import edu.iesam.features.podcast.data.PodcastDataRepository;
import edu.iesam.features.podcast.data.PodcastMemLocalDataSource;
import edu.iesam.features.podcast.domain.GetPodcastsUseCase;
import edu.iesam.features.podcast.domain.Podcast;
import edu.iesam.features.podcast.domain.PodcastRepository;
import edu.iesam.features.podcast.domain.SavePodcastUseCase;

import java.util.ArrayList;

public class PodcastView {
public static void getPodcast(){
    GetPodcastsUseCase getPodcastsUseCase = new GetPodcastsUseCase(new PodcastDataRepository(new PodcastMemLocalDataSource()));

    ArrayList<Podcast> podcastList = getPodcastsUseCase.execute();
}

public static void savePodcast(){
    SavePodcastUseCase savePodcastUseCase = new SavePodcastUseCase(new PodcastDataRepository(new PodcastMemLocalDataSource()));
    Podcast p = new Podcast("111","AAAA", "AA11","1234");
    savePodcastUseCase.execute(p);

    getPodcast();
}
}
