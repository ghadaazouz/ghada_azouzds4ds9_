package tn.esprit.tp_ghada_azouz_4ds9.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.Support;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeCourse;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;

    private Integer level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float price;
    private Integer timeSlot;

    @OneToMany(mappedBy="course")
    private Set<Registration> registrations;

}

