package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numCourse;
    private int level;
    @OneToMany
    private Set<Registration> registrations;


    @OneToMany(mappedBy = "course")
    private List<Registration> Registrations;


}
