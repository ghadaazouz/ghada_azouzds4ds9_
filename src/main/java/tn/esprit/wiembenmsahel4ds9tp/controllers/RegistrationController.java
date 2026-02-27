package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IRegistrationService;

import java.util.List;

@RestController
@RequestMapping("/api/registration")
@AllArgsConstructor
public class RegistrationController {

    IRegistrationService registrationService;

    @PostMapping("/updateRegistration")
    Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @PutMapping("/addPiste")
    Registration updateRegistration(@RequestBody Registration registration) {
        return registrationService.updateRegistration(registration);
    }

    @DeleteMapping("/deleteRegistration/{id}")
    void deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
    }

    @GetMapping("/getRegistration/{id}")
    Registration getRegistration(@PathVariable Long id) {
        return registrationService.getRegistration(id);
    }

    @GetMapping("/getRegistrations/{id}")
    List<Registration> getRegistrations() {
        return registrationService.getAllRegistrations();
    }
}
