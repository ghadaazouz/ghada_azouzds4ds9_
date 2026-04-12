package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Subscription;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ISubscriptionService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/subscription")
@AllArgsConstructor
public class SubscriptionController {

    ISubscriptionService subscriptionService;

    @PostMapping("/addSubscription")
    Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.addSubscription(subscription);
    }

    @PutMapping("/updateSubscription")
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

    @GetMapping("/getSubscriptions")
    List<Subscription> getSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

    @GetMapping("/byType/{type}")
    public Set<Subscription> getSubscriptionByType(@PathVariable TypeSubscription type) {
        return subscriptionService.getSubscriptionByType(type);
    }

    @GetMapping("/byDates")
    public List<Subscription> getSubscriptionsByDates(
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate) {

        return subscriptionService.retrieveSubscriptionsByDates(startDate, endDate);
    }

}
