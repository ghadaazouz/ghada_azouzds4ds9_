package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Subscription;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IskierService;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IsubscriptionService;

import java.util.List;
@RestController
@RequestMapping("/api/subscription")
@AllArgsConstructor
public class SubscriptionContoller {
    IsubscriptionService subscriptionService;

    @PostMapping("/addSubscription")
    Subscription addSubscription(@RequestBody Subscription subscription){
        return subscriptionService.addSubscription(subscription);
    }

    @PostMapping("/updateSubscription")
    Subscription updateSubscription(@RequestBody Subscription subscription){
        return subscriptionService.updateSubscription(subscription);
    }

    @DeleteMapping("/deleteSubscription/{id}")
    void deleteSubscription(@PathVariable Long id){
        subscriptionService.deleteSubscription(id);
    }

    @GetMapping("/getSubscription")
    Subscription getSkier(@PathVariable Long id){
        return subscriptionService.getSubscription(id);
    }

    @GetMapping("/getSubscription")
    List<Subscription> getSkier(){
        return subscriptionService.getAllSubscriptions();
    }
}
