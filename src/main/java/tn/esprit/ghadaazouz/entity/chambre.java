package tn.esprit.ghadaazouz.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class chambre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC; // L'énumération est utilisée ici

    @ManyToOne
    private bloc bloc;

    @OneToMany(cascade = CascadeType.ALL) // Relation 1:N unidirectionnelle [cite: 105, 152]
    private Set<reservation> reservations;
}


enum TypeChambre { SIMPLE, DOUBLE, TRIPLE }