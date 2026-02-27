package tn.esprit.tp_ghada_azouz_4ds9.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ICourseService;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/course")
@AllArgsConstructor
public class CourseController {
    ICourseService courseService;

    @PostMapping("/addCourse")
    Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PostMapping("/updateCourse")
    Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/deleteCourse/{id}")
    void deleteCurse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }

    @GetMapping("/getCourse")
    Course getCourse(@PathVariable Long id){
        return courseService.getCourse(id);
    }

    @GetMapping("/getCourses")
    List<Course> getCourses(){
        return courseService.getAllCourses();
    }
}
