package tn.esprit.wiembenmsahel4ds9tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.TypeSubscription;

import java.util.List;

@Repository
public interface SkierRepository extends JpaRepository<Skier, Long> {

    List<Skier> findBySubscription_TypeSub(TypeSubscription type);

}
