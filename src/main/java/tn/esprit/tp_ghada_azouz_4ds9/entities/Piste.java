package tn.esprit.tp_ghada_azouz_4ds9.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.Color;

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

