package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long IdRegistration;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne
    private Skier skier;
}
