package hr.hyperdeltait.gmsservice_main.Base.Models.Commands;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class TrainerCommand {
    @NotBlank(message = "First name mustn't be blank!")
    private String firstName;

    @NotBlank(message = "Last name mustn't be blank!")
    private String lastName;

    @NotBlank(message = "Description mustn't be blank!")
    private String description;

    @NotBlank(message = "Image mustn't be empty!")
    private String image;

}
