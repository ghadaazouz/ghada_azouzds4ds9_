package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int IdRegistration;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    private skier skier;


}
