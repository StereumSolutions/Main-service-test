package hr.hyperdeltait.gmsservice_main.Base.Models.Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "gallery")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "image", length = 100)
    private String image;

    public Gallery(String image) {
        this.image = image;
    }
}