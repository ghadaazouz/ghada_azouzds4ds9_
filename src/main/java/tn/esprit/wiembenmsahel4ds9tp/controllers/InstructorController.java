package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Instructor;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.Support;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IInstructorService;

import java.util.List;

@RestController
@RequestMapping("/api/instructor")
@AllArgsConstructor
public class InstructorController {

    IInstructorService instructorService;

    @PostMapping("/addInstructor")
    Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("/updateInstructor")
    Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.updateInstructor(instructor);
    }

    @DeleteMapping("/deleteInstructor/{id}")
    void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }

    @GetMapping("/getInstructor/{id}")
    Instructor getInstructor(@PathVariable Long id) {
        return instructorService.getInstructor(id);
    }

    @GetMapping("/getInstructors")
    List<Instructor> getInstructors() {
        return instructorService.getAllInstructors();
    }

    @PostMapping("/addInstructorAndAssignToCourse/{numCourse}")
    public Instructor addInstructorAndAssignToCourse(
            @RequestBody Instructor instructor,
            @PathVariable Long numCourse) {

        return instructorService.addInstructorAndAssignToCourse(instructor, numCourse);
    }

    @GetMapping("/weeks/{numInstructor}/{support}")
    public List<Integer> getWeeks(@PathVariable Long numInstructor,
                                  @PathVariable Support support) {

        return instructorService.numWeeksCourseOfInstructorBySupport(numInstructor, support);
    }

}
