package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entity.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Subscription;

import java.util.List;

public interface IsubscriptionService {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    void deleteSubscription(Long id);
    Subscription getSubscription(Long id);
    List<Subscription> getAllSubscriptions();
}
