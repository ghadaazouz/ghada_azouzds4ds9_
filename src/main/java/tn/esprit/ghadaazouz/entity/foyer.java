package tn.esprit.ghadaazouz.entity;

import jakarta.persistence.*;

@Entity
public class foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne // Relation 1:1 [cite: 10, 79]
    private Universite universite;
}
