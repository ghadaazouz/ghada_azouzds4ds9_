package tn.esprit.wiembenmsahel4ds9tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.wiembenmsahel4ds9tp.entities.Subscription;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    Set<Subscription> findByTypeSubOrderByStartDateAsc(TypeSubscription type);
    List<Subscription> findByStartDateBetween(LocalDate startDate, LocalDate endDate);

}
