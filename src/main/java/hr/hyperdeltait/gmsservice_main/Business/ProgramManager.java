package hr.hyperdeltait.gmsservice_main.Business;

import hr.hyperdeltait.gmsservice_main.Base.Interfaces.IProgramManager;
import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Program;
import hr.hyperdeltait.gmsservice_main.Base.Models.Commands.ProgramCommand;
import hr.hyperdeltait.gmsservice_main.Repository.ProgramRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProgramManager implements IProgramManager {

    private final ProgramRepository programRepository;

    public ProgramManager(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public List<Program> findAll() { return programRepository.findAll(); }

    @Override
    public Optional<Program> findById(Integer id) { return programRepository.findById(id); }


    private Program mapDtoToProgramPost(ProgramCommand programCommand){
        return new Program(
                programCommand.getName(),
                programCommand.getDescription(),
                programCommand.getImage()
        );
    }
    private Program mapDtoToProgramPut(Integer id, ProgramCommand programCommand){
        return new Program(
                id,
                programCommand.getName(),
                programCommand.getDescription(),
                programCommand.getImage()
        );
    }
}
