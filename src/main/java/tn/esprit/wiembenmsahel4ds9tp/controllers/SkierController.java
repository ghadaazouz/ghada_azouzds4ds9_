package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.TypeSubscription;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ISkierService;

import java.util.List;

@RestController
@RequestMapping("/api/skier")
@AllArgsConstructor
public class SkierController {

    ISkierService skierService;

    @PostMapping("/addSkier")
    Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @PutMapping("/updateSkier")
    Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }

    @DeleteMapping("/deleteSkier/{id}")
    void deleteSkier(@PathVariable Long id) {
        skierService.deleteSkier(id);
    }

    @GetMapping("/getSkier/{id}")
    Skier getSkier(@PathVariable Long id) {
        return skierService.getSkier(id);
    }

    @GetMapping("/getSkiers")
    List<Skier> getSkiers() {
        return skierService.getAllSkiers();
    }

    @PutMapping("/assignSkierToPiste/{numSkier}/{numPiste}")
    public void assignSkierToPiste(@PathVariable Long numSkier,
                                   @PathVariable Long numPiste) {

        skierService.assignSkierToPiste(numSkier, numPiste);
    }

    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(
            @RequestBody Skier skier,
            @PathVariable Long numCourse) {

        return skierService.addSkierAndAssignToCourse(skier, numCourse);
    }

    @GetMapping("/bySubscription/{type}")
    public List<Skier> getSkiersBySubscriptionType(@PathVariable TypeSubscription type) {
        return skierService.retrieveSkiersBySubscriptionType(type);
    }

}
