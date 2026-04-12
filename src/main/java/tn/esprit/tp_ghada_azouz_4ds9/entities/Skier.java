package tn.esprit.tp_ghada_azouz_4ds9.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;

    @ManyToMany
    private Set<Piste> pistes;

    @OneToMany(mappedBy="skier")
    private Set<Registration> registrations;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Subscription subscription;

}

