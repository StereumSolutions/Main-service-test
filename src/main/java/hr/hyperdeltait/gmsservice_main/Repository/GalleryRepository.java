package hr.hyperdeltait.gmsservice_main.Repository;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<Gallery, Integer> {
}