package hr.hyperdeltait.gmsservice_main.UnitTests.Business;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Program;
import hr.hyperdeltait.gmsservice_main.Business.ProgramManager;
import hr.hyperdeltait.gmsservice_main.Repository.ProgramRepository;
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
public class ProgramManagerTests {
    @InjectMocks
    private ProgramManager programManager;

    @Mock
    private ProgramRepository programRepository;

    @Test
    void findProgramById(){
        final Optional<Program> expectedProgram = Optional.of(new Program(1, "testname", "testDescription", "imagestream"));
        when(programRepository.findById(anyInt())).thenReturn(expectedProgram);

        final Optional<Program> actual = programManager.findById(getRandomInt());

        assertThat(actual).usingRecursiveComparison().isEqualTo(expectedProgram);
        verify(programRepository, times(1)).findById(anyInt());
        verifyNoMoreInteractions(programRepository);
    }
    private int getRandomInt() {
        return new Random().ints(1, 10).findFirst().orElseThrow();
    }
}
