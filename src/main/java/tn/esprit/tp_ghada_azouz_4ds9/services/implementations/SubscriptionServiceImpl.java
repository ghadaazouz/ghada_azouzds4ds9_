package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Subscription;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.SubscriptionRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ISubscriptionService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    @Override
    public Subscription getSubscription(Long id) {
        //Methode1
        // return SubscriptionRepository.findById(id).get();
        //Methode2
        return subscriptionRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Subscription avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    @Override
    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return subscriptionRepository.findByTypeSubOrderByStartDateAsc(type);
    }

    @Override
    public List<Subscription> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return subscriptionRepository.findByStartDateBetween(startDate, endDate);
    }

}
