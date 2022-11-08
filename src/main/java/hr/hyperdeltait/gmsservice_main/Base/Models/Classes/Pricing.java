package hr.hyperdeltait.gmsservice_main.Base.Models.Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "catalog")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Pricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "description", nullable = false, length = 5000)
    private String description;

    @Column(name = "price", length = 100)
    private float price;

    public Pricing(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
