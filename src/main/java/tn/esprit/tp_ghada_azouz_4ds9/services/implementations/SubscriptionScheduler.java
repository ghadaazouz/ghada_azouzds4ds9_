package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Subscription;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.SkierRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.SubscriptionRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SubscriptionScheduler {

    private SubscriptionRepository subscriptionRepository;
    private SkierRepository skierRepository;

    // Every month
    @Scheduled(cron = "0 0 0 1 * ?")
    public void showMonthlyRecurringRevenue() {

        List<Subscription> subscriptions = subscriptionRepository.findAll();
        float mrr = 0;

        for (Subscription sub : subscriptions) {

            if (sub.getPrice() != null) {

                if (sub.getTypeSub() == TypeSubscription.MONTHLY) {
                    mrr += sub.getPrice();
                }
                else if (sub.getTypeSub() == TypeSubscription.SEMESTRIAL) {
                    mrr += sub.getPrice() / 6;
                }
                else if (sub.getTypeSub() == TypeSubscription.ANNUAL) {
                    mrr += sub.getPrice() / 12;
                }
            }
        }

        log.info("Monthly Recurring Revenue (MRR) is : {}", mrr);
    }

    // Every day at 8 AM
    @Scheduled(cron = "0 0 8 * * *")
    public void retrieveSubscriptions() {

        List<Subscription> subscriptions = subscriptionRepository.findAll();
        List<Skier> skiers = skierRepository.findAll();

        LocalDate targetDate = LocalDate.now().plusDays(7);

        for (Subscription sub : subscriptions) {

            if (sub.getEndDate() != null && sub.getEndDate().isEqual(targetDate)) {

                for (Skier sk : skiers) {

                    if (sk.getSubscription() != null &&
                            sk.getSubscription().getNumSub().equals(sub.getNumSub())) {

                        log.info("Alert : Subscription {} expires in 7 days. Skier : {} {} {}",
                                sub.getNumSub(),
                                sk.getNumSkier(),
                                sk.getFirstName(),
                                sk.getLastName());
                    }
                }
            }
        }
    }
}