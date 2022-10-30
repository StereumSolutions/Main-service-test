package hr.hyperdeltait.gmsservice_main.UnitTests.Business;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Gallery;
import hr.hyperdeltait.gmsservice_main.Business.GalleryManager;
import hr.hyperdeltait.gmsservice_main.Repository.GalleryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;
import java.util.Random;

@ExtendWith(MockitoExtension.class)
public class GalleryManagerTests {
    @InjectMocks
    private GalleryManager galleryManager;

    @Mock
    private GalleryRepository galleryRepository;

    @Test
    void findGalleryById(){
        final var expectedGallery = Optional.of(new Gallery(1, "imagestream"));
        when(galleryRepository.findById(anyInt())).thenReturn(expectedGallery);

        final var actual = galleryManager.findById(getRandomInt());

        assertThat(actual).usingRecursiveComparison().isEqualTo(expectedGallery);
        verify(galleryRepository, times(1)).findById(anyInt());
        verifyNoMoreInteractions(galleryRepository);
    }
    private int getRandomInt() {
        return new Random().ints(1, 10).findFirst().orElseThrow();
    }
}
