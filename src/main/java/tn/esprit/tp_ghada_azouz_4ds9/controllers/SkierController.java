package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IregistrationService;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IskierService;

import java.util.List;
@RestController
@RequestMapping("/api/skier")
@AllArgsConstructor
public class SkierController {
    IskierService skierService;

    @PostMapping("/addSkier")
    Skier addSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }

    @PostMapping("/updateSkier")
    Skier updateSkier(@RequestBody Skier skier){
        return skierService.updateSkier(skier);
    }

    @DeleteMapping("/deleteSkier/{id}")
    void deleteSkier(@PathVariable Long id){
        skierService.deleteSkier(id);
    }

    @GetMapping("/getSkier")
    Skier getSkier(@PathVariable Long id){
        return skierService.getSkier(id);
    }

    @GetMapping("/getSkier")
    List<Skier> getSkier(){
        return skierService.getAllSkiers();
    }
}
