package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class piste {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long numPiste;
        private String namePist;
        private int length;
        private int slope;
        private Color color;



    @ManyToMany
    private Set<skier> skier;





}
