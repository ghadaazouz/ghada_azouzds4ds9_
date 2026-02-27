package tn.esprit.wiembenmsahel4ds9tp.services.interfaces;

import tn.esprit.wiembenmsahel4ds9tp.entities.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long id);
    Course getCourse(Long id);
    List<Course> getAllCourses();
}
