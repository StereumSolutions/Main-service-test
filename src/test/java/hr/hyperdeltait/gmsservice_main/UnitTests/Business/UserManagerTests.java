package hr.hyperdeltait.gmsservice_main.UnitTests.Business;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.User;
import hr.hyperdeltait.gmsservice_main.Business.UserManager;
import hr.hyperdeltait.gmsservice_main.Repository.UserRepository;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class UserManagerTests {

    @InjectMocks
    private UserManager userService;

    @Mock
    private UserRepository userRepository;


    @Test
    void findUserById() {
        final var expectedUser = Optional.of(new User(1, "Userito", "Despacito", LocalDate.of(2020, 10, 10), "Muško", "email@domain.xyz", "0911", LocalDate.of(2020, 10, 10)));
        when(userRepository.findById(anyInt())).thenReturn(expectedUser);

        final var actual = userService.findUserById(getRandomInt());

        assertThat(actual).usingRecursiveComparison().isEqualTo(expectedUser);
        verify(userRepository, times(1)).findById(anyInt());
        verifyNoMoreInteractions(userRepository);
    }
    private int getRandomInt() {
        return new Random().ints(1, 10).findFirst().getAsInt();
    }
}