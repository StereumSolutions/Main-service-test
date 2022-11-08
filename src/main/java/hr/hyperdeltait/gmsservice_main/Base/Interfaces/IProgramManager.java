package hr.hyperdeltait.gmsservice_main.Base.Interfaces;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Program;

import java.util.List;
import java.util.Optional;


public interface IProgramManager{
    List<Program> findAll();
    Optional<Program> findById(Integer id);
}

