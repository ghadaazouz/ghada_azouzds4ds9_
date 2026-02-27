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
public class Subscription {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long IdSubscription;

    @Enumerated(EnumType.STRING)
    private TypeSubscription support;

}
