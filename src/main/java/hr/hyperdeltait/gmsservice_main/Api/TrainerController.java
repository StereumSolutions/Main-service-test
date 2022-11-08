package hr.hyperdeltait.gmsservice_main.Api;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Trainer;
import hr.hyperdeltait.gmsservice_main.Business.TrainerManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("trainer")
public class TrainerController {

    private final TrainerManager trainerManager;

    public TrainerController(TrainerManager trainerManager) {
        this.trainerManager = trainerManager;
    }

    @GetMapping
    public List<Trainer> findAll() { return trainerManager.findAll(); }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Trainer> findById(@PathVariable Integer id){
        return trainerManager.findById(id)
                .map(
                        trainer -> ResponseEntity.status(HttpStatus.OK).body(trainer)
                )
                .orElseGet(
                        () -> ResponseEntity.status(HttpStatus.NOT_FOUND).build()
                );
    }
}

