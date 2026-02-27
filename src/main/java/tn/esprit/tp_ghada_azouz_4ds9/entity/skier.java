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
public class Skier {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long IdSkier;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skier")
    private Set<Registration> registration;

    @ManyToMany
    private Set<Piste> pistes;

    @OneToOne (cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Subscription subscription;
}
