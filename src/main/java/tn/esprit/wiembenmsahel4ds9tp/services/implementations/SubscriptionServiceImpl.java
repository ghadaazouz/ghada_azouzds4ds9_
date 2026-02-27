package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Subscription;
import tn.esprit.wiembenmsahel4ds9tp.repositories.SubscriptionRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ISubscriptionService;

import java.util.List;

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
}
