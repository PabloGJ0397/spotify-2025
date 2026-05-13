package edu.iesam.features.albums.domain;

import edu.iesam.mocks.albums.AlbumMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveAlbumUseCaseTest {

    public SaveAlbumUseCase saveAlbumUseCase;
    public AlbumMockRepository albumMockRepository;

    /**
     * Tipo test: No devuelve nada
     * Valido que se está llamando a los métodos del repositorio
     */
    @Test
    public void shouldCallSaveMethodWhenUseCaseExecuted(){
        //Given
        albumMockRepository = new AlbumMockRepository();
        saveAlbumUseCase = new SaveAlbumUseCase(albumMockRepository);
        Album album = new Album("1", "Album1", "2024");

        //When
        saveAlbumUseCase.execute(album);

        //Then
        assertEquals(1, albumMockRepository.countSaveMethod);
    }

}