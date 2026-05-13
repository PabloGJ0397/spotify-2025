package edu.iesam.features.podcast.domain;

import edu.iesam.mocks.podcast.PodcastMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavePodcastUseCaseTest {
    public SavePodcastUseCase savePodcastUseCase;
    public PodcastMockRepository podcastMockRepository;

    @BeforeEach
    void setUp() {
        podcastMockRepository = new PodcastMockRepository();
        savePodcastUseCase = new SavePodcastUseCase(podcastMockRepository);
    }

    @Test
    public void shouldCallSavePodcast() {
        //Given
        Podcast p1 = new Podcast("1A", "AAAAAA", "1A1A1A", "12345");
        //When
        savePodcastUseCase.execute(p1);
        //Then
        assertEquals(1, podcastMockRepository.countSaveMethod);


    }
}

