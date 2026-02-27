package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ISkierService;

import java.util.List;

@RestController
@RequestMapping("/api/skier")
@AllArgsConstructor
public class SkierController {

    ISkierService skierService;

    @PostMapping("/updateSkier")
    Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @PutMapping("/addSkier")
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

    @GetMapping("/getSkiers/{id}")
    List<Skier> getSkiers() {
        return skierService.getAllSkiers();
    }
}
