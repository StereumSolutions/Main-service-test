package hr.hyperdeltait.gmsservice_main.Business;

import hr.hyperdeltait.gmsservice_main.Base.Interfaces.IPricingManager;
import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Pricing;
import hr.hyperdeltait.gmsservice_main.Repository.PricingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PricingManager implements IPricingManager {

    private final PricingRepository pricingRepository;

    public PricingManager(PricingRepository pricingRepository) {
        this.pricingRepository = pricingRepository;
    }

    @Override
    public List<Pricing> findAll() { return pricingRepository.findAll(); }

    @Override
    public Optional<Pricing> findById(Integer id) { return pricingRepository.findById(id); }
}
