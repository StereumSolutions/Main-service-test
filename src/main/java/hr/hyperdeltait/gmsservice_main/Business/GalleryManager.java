package hr.hyperdeltait.gmsservice_main.Business;

import hr.hyperdeltait.gmsservice_main.Base.Interfaces.IGalleryManager;
import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Gallery;
import hr.hyperdeltait.gmsservice_main.Base.Models.Commands.GalleryCommand;
import hr.hyperdeltait.gmsservice_main.Repository.GalleryRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GalleryManager implements IGalleryManager {

    private final GalleryRepository galleryRepository;

    public GalleryManager(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    @Override
    public List<Gallery> findAll() { return galleryRepository.findAll(); }

    @Override
    public Optional<Gallery> findById(Integer id) { return galleryRepository.findById(id); }


    private Gallery mapDtoToTrainerPost(GalleryCommand galleryCommand){
        return new Gallery(
                galleryCommand.getImage()
        );
    }
    private Gallery mapDtoToTrainerPut(Integer id, GalleryCommand galleryCommand){
        return new Gallery(
                id,
                galleryCommand.getImage()
        );
    }
}

