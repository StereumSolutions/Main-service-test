package hr.hyperdeltait.gmsservice_main.Base.Interfaces;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Pricing;

import java.util.List;
import java.util.Optional;


public interface IPricingManager{

    List<Pricing> findAll();
    Optional<Pricing> findById(Integer id);
}
