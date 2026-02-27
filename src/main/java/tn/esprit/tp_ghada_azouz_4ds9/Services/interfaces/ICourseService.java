package tn.esprit.tp_ghada_azouz_4ds9.services.interfaces;

import tn.esprit.tp_ghada_azouz_4ds9.entity.Course;

import java.util.List;

public interface ICourseService {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long id);
    Course getCourse(Long id);
    List<Course> getAllCourses();
}
