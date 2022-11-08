package hr.hyperdeltait.gmsservice_main.Base.Interfaces;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Trainer;

import java.util.List;
import java.util.Optional;


public interface ITrainerManager{

    List<Trainer> findAll();
    Optional<Trainer> findById(Integer id);
}

