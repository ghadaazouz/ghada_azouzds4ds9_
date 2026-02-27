package tn.esprit.wiembenmsahel4ds9tp.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseController {

    ICourseService courseService;

    @PostMapping("/updateCourse")
    Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course); // appel de l'interface dans l'interface ICourseService
    }

    @PutMapping("/addCourse")
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

    @GetMapping("/getCourses/{id}")
    List<Course> getCourses() {
        return courseService.getAllCourses();
    }

}
