package hr.hyperdeltait.gmsservice_main.Repository;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Integer> {
}