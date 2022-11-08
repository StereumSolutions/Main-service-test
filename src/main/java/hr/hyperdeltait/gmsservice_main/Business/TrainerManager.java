package hr.hyperdeltait.gmsservice_main.Business;

import hr.hyperdeltait.gmsservice_main.Base.Interfaces.ITrainerManager;
import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Trainer;
import hr.hyperdeltait.gmsservice_main.Repository.TrainerRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TrainerManager implements ITrainerManager {

    private final TrainerRepository trainerRepository;

    public TrainerManager(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> findAll() { return trainerRepository.findAll(); }

    @Override
    public Optional<Trainer> findById(Integer id) { return trainerRepository.findById(id); }
}

