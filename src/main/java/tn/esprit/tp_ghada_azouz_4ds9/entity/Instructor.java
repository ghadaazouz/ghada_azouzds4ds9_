package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInstructor;
    private String firstname;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Course> courses;
}
