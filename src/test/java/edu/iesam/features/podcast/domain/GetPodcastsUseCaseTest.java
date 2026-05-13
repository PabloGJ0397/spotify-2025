package edu.iesam.features.podcast.domain;

import edu.iesam.mocks.podcast.EmptyPodcastMockRepository;
import edu.iesam.mocks.podcast.NullPodcastMockRepository;
import edu.iesam.mocks.podcast.PodcastMockRepository;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GetPodcastsUseCaseTest {
    public GetPodcastsUseCase  getPodcastsUseCase;
    public PodcastMockRepository podcastMockRepository;
    public EmptyPodcastMockRepository emptyPodcastMockRepository;
    public NullPodcastMockRepository nullPodcastMockRepository;
    @BeforeEach
    void setUp()
    {
        podcastMockRepository = new PodcastMockRepository();
    emptyPodcastMockRepository = new EmptyPodcastMockRepository();
    nullPodcastMockRepository = new NullPodcastMockRepository();
    }
    //Test que devuelve contenido = ArrayList<>
   @Test
    public void shouldReturnPodcastsList(){
        //Given
       getPodcastsUseCase = new GetPodcastsUseCase(podcastMockRepository);
       //When
       ArrayList<Podcast> podcasts = getPodcastsUseCase.execute();
       //Then
       assertEquals(3, podcasts.size());
       assertEquals("1A", podcasts.get(0).getId());
   }


   //Test que devuelve contenido = empty
    @Test
    public void shouldReturnEmptyPodcastsList(){
        //Given
        getPodcastsUseCase = new GetPodcastsUseCase(emptyPodcastMockRepository);
        //When
        ArrayList<Podcast> podcasts = getPodcastsUseCase.execute();

        //Then
        assertEquals(0,podcasts.size());
    }


    // Test que no devuelve nada = null
    @Test
    public void shouldReturnNullPodcastsList(){
        //Given
        getPodcastsUseCase = new GetPodcastsUseCase(nullPodcastMockRepository);
        //When
        ArrayList<Podcast> podcasts = getPodcastsUseCase.execute();
        //Then
        assertNull(podcasts);
    }
}
