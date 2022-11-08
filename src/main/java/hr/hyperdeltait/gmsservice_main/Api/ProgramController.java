package hr.hyperdeltait.gmsservice_main.Api;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Program;
import hr.hyperdeltait.gmsservice_main.Business.ProgramManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("program")
public class ProgramController {

    private final ProgramManager programManager;

    public ProgramController(ProgramManager programManager) {
        this.programManager = programManager;
    }

    @GetMapping
    public List<Program> findAll() { return programManager.findAll(); }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Program> findById(@PathVariable Integer id){
        return programManager.findById(id)
                .map(
                        program -> ResponseEntity.status(HttpStatus.OK).body(program)
                )
                .orElseGet(
                        () -> ResponseEntity.status(HttpStatus.NOT_FOUND).build()
                );
    }
}

