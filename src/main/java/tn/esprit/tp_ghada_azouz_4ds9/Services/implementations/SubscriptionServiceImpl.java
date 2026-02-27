package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Subscription;
import tn.esprit.tp_ghada_azouz_4ds9.repository.SkierRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repository.SubscriptionRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IsubscriptionService;

import java.util.List;
@Service
@AllArgsConstructor
public class SubscriptionServiceImpl implements IsubscriptionService {
    private final SubscriptionRepository subscriptionRepository;
    public SubscriptionServiceImpl(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }
    @Override
    public Subscription addSubscription(Subscription skier) {
        return subscriptionRepository.save(skier);
    }

    @Override
    public Subscription updateSubscription(Subscription skier) {
        return subscriptionRepository.save(skier);
    }

    @Override
    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    @Override
    public Subscription getSubscription(Long id) {
        return subscriptionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
    }

    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

}
