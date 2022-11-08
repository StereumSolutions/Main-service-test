package hr.hyperdeltait.gmsservice_main.Repository;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
}