package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    @Enumerated(EnumType.STRING)
    private Support support;

    @Enumerated(EnumType.STRING)
    private TypeCourse typecourse;

    @OneToMany(mappedBy = "course")
    private List<Registration> registrations;




}
