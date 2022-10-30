package hr.hyperdeltait.gmsservice_main.Base.Models.Commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class GalleryCommand {

    @NotBlank(message = "Image mustn't be empty!")
    private String image;
}
