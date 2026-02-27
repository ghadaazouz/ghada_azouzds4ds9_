package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Subscription;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ISubscriptionService;

import java.util.List;

@RestController
@RequestMapping("/api/subscription")
@AllArgsConstructor
public class SubscriptionController {

    ISubscriptionService subscriptionService;

    @PostMapping("/updateSubscription")
    Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);
    }

    @PutMapping("/addSubscription")
    Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.updateSubscription(subscription);
    }

    @DeleteMapping("/deleteSubscription/{id}")
    void deleteSubscrption(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
    }

    @GetMapping("/getSubscription/{id}")
    Subscription getSubscription(@PathVariable Long id) {
        return subscriptionService.getSubscription(id);
    }

    @GetMapping("/getSubscriptions/{id}")
    List<Subscription> getSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }
}
