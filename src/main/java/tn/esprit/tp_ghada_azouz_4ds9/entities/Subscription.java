package tn.esprit.tp_ghada_azouz_4ds9.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;

    private LocalDate startDate;
    private LocalDate endDate;
    private Float price;
    @Enumerated(EnumType.STRING)
    TypeSubscription typeSub;

}
