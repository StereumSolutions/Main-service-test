package hr.hyperdeltait.gmsservice_main.Api;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Pricing;
import hr.hyperdeltait.gmsservice_main.Business.PricingManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pricing")
public class PricingController {

    private final PricingManager pricingManager;

    public PricingController(PricingManager pricingManager) {
        this.pricingManager = pricingManager;
    }

    @GetMapping
    public List<Pricing> findAll() { return pricingManager.findAll(); }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Pricing> findById(@PathVariable Integer id){
        return pricingManager.findById(id)
                .map(
                        pricing -> ResponseEntity.status(HttpStatus.OK).body(pricing)
                )
                .orElseGet(
                        () -> ResponseEntity.status(HttpStatus.NOT_FOUND).build()
                );
    }
}

