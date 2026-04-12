package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Course;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseController {

    ICourseService courseService;

    @PostMapping("/addCourse")
    Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course); // appel de l'interface dans l'interface ICourseService
    }

    @PutMapping("/updateCourse")
    Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course); // appel de l'interface dans l'interface ICourseService
    }

    @DeleteMapping("/deleteCourse/{id}")
    void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @GetMapping("/getCourse/{id}")
    Course getCourse(@PathVariable Long id) {
        return courseService.getCourse(id);
    }

    @GetMapping("/getCourses")
    List<Course> getCourses() {
        return courseService.getAllCourses();
    }

}
