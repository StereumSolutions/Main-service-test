package hr.hyperdeltait.gmsservice_main.Api;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Gallery;
import hr.hyperdeltait.gmsservice_main.Business.GalleryManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gallery")
public class GalleryController {

    private final GalleryManager galleryManager;

    public GalleryController(GalleryManager galleryManager) {
        this.galleryManager = galleryManager;
    }

    @GetMapping
    public List<Gallery> findAll() { return galleryManager.findAll(); }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Gallery> findById(@PathVariable Integer id){
        return galleryManager.findById(id)
                .map(
                        gallery -> ResponseEntity.status(HttpStatus.OK).body(gallery)
                )
                .orElseGet(
                        () -> ResponseEntity.status(HttpStatus.NOT_FOUND).build()
                );
    }
}

