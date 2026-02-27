package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long IdInstructor;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Course> courses;

}
