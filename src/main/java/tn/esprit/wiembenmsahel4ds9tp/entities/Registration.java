package tn.esprit.wiembenmsahel4ds9tp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;

    private Integer numWeek;

    @ManyToOne
    private Skier skier;

    @ManyToOne
    private Course course;

}
