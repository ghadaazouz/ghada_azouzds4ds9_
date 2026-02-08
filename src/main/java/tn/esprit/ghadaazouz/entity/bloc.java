package tn.esprit.ghadaazouz.entity;

import jakarta.persistence.*;

@Entity
public class bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne // Plusieurs blocs pour un foyer [cite: 11, 114]
    private foyer foyer;
}