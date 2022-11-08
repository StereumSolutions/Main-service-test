package hr.hyperdeltait.gmsservice_main.UnitTests.Business;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Pricing;
import hr.hyperdeltait.gmsservice_main.Business.PricingManager;
import hr.hyperdeltait.gmsservice_main.Repository.PricingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PricingManagerTests {

    @InjectMocks
    private PricingManager pricingManager;

    @Mock
    private PricingRepository pricingRepository;

    @Test
    void findPricingById(){
        final Optional<Pricing> expectedPricing = Optional.of(new Pricing(1, "nametest", "descriptiontest", 10));
        when(pricingRepository.findById(anyInt())).thenReturn(expectedPricing);

        final Optional<Pricing> actual = pricingManager.findById(getRandomInt());

        assertThat(actual).usingRecursiveComparison().isEqualTo(expectedPricing);
        verify(pricingRepository, times(1)).findById(anyInt());
        verifyNoMoreInteractions(pricingRepository);
    }

    private int getRandomInt() {
        return new Random().ints(1, 10).findFirst().orElseThrow();
    }
}
