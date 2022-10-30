package hr.hyperdeltait.gmsservice_main.Base.Models.Commands;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class ProgramCommand {
    @NotBlank(message = "Name mustn't be blank!")
    private String name;

    @NotBlank(message = "Description mustn't be blank!")
    private String description;

    @NotBlank(message = "Image mustn't be empty!")
    private String image;
}

