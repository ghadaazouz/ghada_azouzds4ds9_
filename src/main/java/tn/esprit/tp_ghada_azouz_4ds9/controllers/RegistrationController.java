package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IRegistrationService;

import java.util.List;

@RestController
@RequestMapping("/api/registration")
@AllArgsConstructor
public class RegistrationController {

    IRegistrationService registrationService;

    @PostMapping("/addRegistration")
    Registration addRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @PutMapping("/updateRegistration")
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

    @GetMapping("/getRegistrations")
    List<Registration> getRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @PostMapping("/addRegistrationAndAssignToSkier/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(
            @RequestBody Registration registration,
            @PathVariable Long numSkier) {

        return registrationService.addRegistrationAndAssignToSkier(registration, numSkier);
    }

    @PutMapping("/assignRegistrationToCourse/{numRegistration}/{numCourse}")
    public Registration assignRegistrationToCourse(
            @PathVariable Long numRegistration,
            @PathVariable Long numCourse) {

        return registrationService.assignRegistrationToCourse(numRegistration, numCourse);
    }

    @PostMapping("/addFullRegistration/{numSkier}/{numCourse}")
    public Registration addFullRegistration(@RequestBody Registration registration,
                                            @PathVariable Long numSkier,
                                            @PathVariable Long numCourse) {

        return registrationService.addRegistrationAndAssignToSkierAndCourse(registration, numSkier, numCourse);
    }

}
