package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Instructor;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IpisteService;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IregistrationService;

import java.util.List;
@RestController
@RequestMapping("/api/registration")
@AllArgsConstructor
public class RegistrationController {
    IregistrationService registrationService;

    @PostMapping("/addRegistration")
    Registration addRegistration(@RequestBody Registration registration){
        return registrationService.addRegistration(registration);
    }

    @PostMapping("/updateRegistration")
    Registration updateRegistration(@RequestBody Registration registration){
        return registrationService.updateRegistration(registration);
    }

    @DeleteMapping("/deleteRegistration/{id}")
    void deleteRegistration(@PathVariable Long id){
        registrationService.deleteRegistration(id);
    }

    @GetMapping("/getRegistration")
    Registration getRegistration(@PathVariable Long id){
        return registrationService.getRegistration(id);
    }

    @GetMapping("/getRegistration")
    List<Registration> getRegistration(){
        return registrationService.getAllRegistrations();
    }
}
