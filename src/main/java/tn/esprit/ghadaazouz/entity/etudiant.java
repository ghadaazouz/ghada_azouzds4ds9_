package tn.esprit.ghadaazouz.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants") // Rend la relation bidirectionnelle [cite: 96, 147]
    private Set<reservation> reservations;
}