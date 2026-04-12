package tn.esprit.tp_ghada_azouz_4ds9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Subscription;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    Set<Subscription> findByTypeSubOrderByStartDateAsc(TypeSubscription type);
    List<Subscription> findByStartDateBetween(LocalDate startDate, LocalDate endDate);

}
