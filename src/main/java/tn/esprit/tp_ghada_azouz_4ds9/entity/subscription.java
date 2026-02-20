package tn.esprit.tp_ghada_azouz_4ds9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSub;
    private TypeSubscription typeSub;

}
