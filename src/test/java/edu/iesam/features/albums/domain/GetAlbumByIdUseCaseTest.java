package edu.iesam.features.albums.domain;

import edu.iesam.mocks.albums.AlbumMockRepository;
import edu.iesam.mocks.albums.NullAlbumMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetAlbumByIdUseCaseTest {

    public GetAlbumByIdUseCase getAlbumByIdUseCase;
    public AlbumMockRepository albumMockRepository;
    public NullAlbumMockRepository nullAlbumMockRepository;

    /**
     * Tipo test: Devuelve 'algo'
     *
     * Devuelve un modelo con información
     */
    @Test
    public void shouldReturnAlbumWhenExecuteUseCase(){
        //Given
        albumMockRepository = new AlbumMockRepository();
        getAlbumByIdUseCase = new GetAlbumByIdUseCase(albumMockRepository);

        //When
        Album album = getAlbumByIdUseCase.execute("1");

        //Then
        assertEquals("1", album.getId());
        assertEquals("Name1", album.getName());
        assertEquals("2024", album.getYear());
    }

    /**
     * Tipo test: Devuelve 'algo'
     *
     * Devuelve null
     */
    @Test
    public void shouldReturnNullWhenExecuteUseCase(){
        //Given
        nullAlbumMockRepository = new NullAlbumMockRepository();
        getAlbumByIdUseCase = new GetAlbumByIdUseCase(nullAlbumMockRepository);

        //When
        Album album = getAlbumByIdUseCase.execute("1");

        //Then
        assertNull(album);
    }

}