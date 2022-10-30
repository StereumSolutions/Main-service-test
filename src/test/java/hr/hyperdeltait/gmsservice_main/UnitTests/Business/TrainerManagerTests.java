package hr.hyperdeltait.gmsservice_main.UnitTests.Business;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Trainer;
import hr.hyperdeltait.gmsservice_main.Business.TrainerManager;
import hr.hyperdeltait.gmsservice_main.Repository.TrainerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import java.util.Random;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TrainerManagerTests {
    @InjectMocks
    private TrainerManager trainerManager;

    @Mock
    private TrainerRepository trainerRepository;

    @Test
    void findTrainerById() {
        final var expectedTrainer = Optional.of(new Trainer(1, "Userito", "Despacito", "Muško",  "imagestream"));
        when(trainerRepository.findById(anyInt())).thenReturn(expectedTrainer);

        final var actual = trainerManager.findById(getRandomInt());

        assertThat(actual).usingRecursiveComparison().isEqualTo(expectedTrainer);
        verify(trainerRepository, times(1)).findById(anyInt());
        verifyNoMoreInteractions(trainerRepository);
    }

    private int getRandomInt() {
        return new Random().ints(1, 10).findFirst().orElseThrow();
    }
}