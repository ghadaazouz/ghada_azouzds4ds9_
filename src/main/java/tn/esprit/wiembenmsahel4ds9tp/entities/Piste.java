package tn.esprit.wiembenmsahel4ds9tp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.Color;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;

    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;
    private Integer length;
    private Integer slope;

    @ManyToMany(mappedBy="pistes",cascade = CascadeType.ALL)
    private Set<Skier> skiers;

}

