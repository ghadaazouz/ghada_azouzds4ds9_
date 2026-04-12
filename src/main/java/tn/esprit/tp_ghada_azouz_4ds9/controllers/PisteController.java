package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/api/piste")
@AllArgsConstructor
public class PisteController {

    IPisteService pisteService;

    @PostMapping("/addPiste")
    Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }

    @PutMapping("/updatePiste")
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

    @GetMapping("/getPistes")
    List<Piste> getPistes() {
        return pisteService.getAllPistes();
    }

}
