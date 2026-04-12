package tn.esprit.tp_ghada_azouz_4ds9.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
