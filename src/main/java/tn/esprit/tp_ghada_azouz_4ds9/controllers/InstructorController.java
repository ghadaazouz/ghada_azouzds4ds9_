package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Instructor;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ICourseService;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IinstructorService;

import java.util.List;
@RestController
@RequestMapping("/api/instructor")
@AllArgsConstructor
public class InstructorController {
    IinstructorService instructorService;

    @PostMapping("/addInstructor")
    Instructor addInstructor(@RequestBody Instructor instructor){
        return instructorService.addInstructor(instructor);
    }

    @PostMapping("/updateInstructor")
    Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/deleteInstructor/{id}")
    void deleteInstructor(@PathVariable Long id){
        instructorService.deleteInstructor(id);
    }

    @GetMapping("/getInstructor")
    Instructor getInstructor(@PathVariable Long id){
        return instructorService.getInstructor(id);
    }

    @GetMapping("/getInstructors")
    List<Instructor> getInstructor(){
        return instructorService.getAllInstructors();
    }
}
