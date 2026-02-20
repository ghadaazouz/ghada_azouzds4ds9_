package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numskier;
    private String firstName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skier")
    private Set<Registration> registration;

    @ManyToMany
    private Set<piste> pistes;

    @OneToOne (cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private subscription subscription;


}
