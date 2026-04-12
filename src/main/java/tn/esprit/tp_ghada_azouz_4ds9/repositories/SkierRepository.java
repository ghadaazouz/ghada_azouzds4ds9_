package tn.esprit.tp_ghada_azouz_4ds9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;

import java.util.List;

@Repository
public interface SkierRepository extends JpaRepository<Skier, Long> {

    List<Skier> findBySubscription_TypeSub(TypeSubscription type);

}
