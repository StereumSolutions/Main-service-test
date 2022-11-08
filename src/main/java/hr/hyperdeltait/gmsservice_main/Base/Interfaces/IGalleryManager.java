package hr.hyperdeltait.gmsservice_main.Base.Interfaces;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Gallery;

import java.util.List;
import java.util.Optional;


public interface IGalleryManager{

    List<Gallery> findAll();
    Optional<Gallery> findById(Integer id);
}
