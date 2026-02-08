package tn.esprit.ghadaazouz.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.Set;

@Entity
public class reservation {
    @Id
    private String idReservation; // Type String selon diagramme [cite: 162]
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL) // Crée une table de jointure [cite: 131, 149]
    private Set<etudiant> etudiants;
}

