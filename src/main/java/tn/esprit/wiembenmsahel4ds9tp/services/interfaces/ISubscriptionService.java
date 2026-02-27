package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Subscription;

import java.util.List;

public interface ISubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    void deleteSubscription(Long id);
    Subscription getSubscription(Long id);
    List<Subscription> getAllSubscriptions();
}
