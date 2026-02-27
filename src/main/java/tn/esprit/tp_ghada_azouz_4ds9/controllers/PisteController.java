package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Instructor;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IinstructorService;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IpisteService;

import java.util.List;
@RestController
@RequestMapping("/api/piste")
@AllArgsConstructor
public class PisteController {
    IpisteService pisteService;

    @PostMapping("/addPiste")
    Piste addPiste(@RequestBody Piste instructor){
        return pisteService.addPiste(instructor);
    }

    @PostMapping("/updatePiste")
    Piste updatePiste(@RequestBody Piste piste){
        return pisteService.updatePiste(piste);
    }

    @DeleteMapping("/deletePiste/{id}")
    void deletePiste(@PathVariable Long id){
        pisteService.deletePiste(id);
    }

    @GetMapping("/getPiste")
    Piste getPiste(@PathVariable Long id){
        return pisteService.getPiste(id);
    }

    @GetMapping("/getPistes")
    List<Piste> getPiste(){
        return pisteService.getAllPistes();
    }
}
