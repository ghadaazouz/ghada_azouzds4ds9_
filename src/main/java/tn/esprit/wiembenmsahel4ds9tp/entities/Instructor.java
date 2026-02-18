package tn.esprit.wiembenmsahel4ds9tp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;

    private String firstName;
    private String lastName;
    private LocalDate dateOfHire;

    @OneToMany
    private Set<Course> courses;

}
