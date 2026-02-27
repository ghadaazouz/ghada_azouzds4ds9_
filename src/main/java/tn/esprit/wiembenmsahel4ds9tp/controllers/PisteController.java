package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Piste;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/api/piste")
@AllArgsConstructor
public class PisteController {

    IPisteService pisteService;

    @PostMapping("/updatePiste")
    Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/addPiste")
    Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.updatePiste(piste);
    }

    @DeleteMapping("/deletePiste/{id}")
    void deletePiste(@PathVariable Long id) {
        pisteService.deletePiste(id);
    }

    @GetMapping("/getPiste/{id}")
    Piste getPiste(@PathVariable Long id) {
        return pisteService.getPiste(id);
    }

    @GetMapping("/getPistes/{id}")
    List<Piste> getPistes() {
        return pisteService.getAllPistes();
    }
}
