package hr.hyperdeltait.gmsservice_main.Base.Models.Commands;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class PricingCommand {
    @NotBlank(message = "Name mustn't be blank!")
    private String name;

    @NotBlank(message = "Description mustn't be blank!")
    private String description;

    @NotBlank(message = "Price mustn't be empty!")
    private float price;
}
