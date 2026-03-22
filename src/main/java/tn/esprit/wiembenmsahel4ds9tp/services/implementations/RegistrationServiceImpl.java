package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;
import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;
import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.repositories.CourseRepository;
import tn.esprit.wiembenmsahel4ds9tp.repositories.RegistrationRepository;
import tn.esprit.wiembenmsahel4ds9tp.repositories.SkierRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IRegistrationService;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IRegistrationService {

    private final RegistrationRepository registrationRepository;
    private final SkierRepository skierRepository;
    private final CourseRepository courseRepository;

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }

    @Override
    public Registration getRegistration(Long id) {
        //Methode1
        // return RegistrationRepository.findById(id).get();
        //Methode2
        return registrationRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Registration avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier) {
        Skier skier = skierRepository.findById(numSkier)
                .orElseThrow(() -> new RuntimeException("Skier not found"));

        registration.setSkier(skier);

        return registrationRepository.save(registration);
    }

    @Override
    public Registration assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Registration registration = registrationRepository.findById(numRegistration)
                .orElseThrow(() -> new RuntimeException("Registration not found"));

        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        registration.setCourse(course);

        return registrationRepository.save(registration);
    }

    @Override
    public Registration addRegistrationAndAssignToSkierAndCourse(Registration registration, Long numSkier, Long numCourse) {
        Skier skier = skierRepository.findById(numSkier)
                .orElseThrow(() -> new RuntimeException("Skier not found"));

        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        long count = registrationRepository.countByCourse(course);

        if ((course.getTypeCourse().name().contains("COLLECTIVE")) && count >= 6) {
            throw new RuntimeException("Course full");
        }

        int age = java.time.LocalDate.now().getYear() - skier.getDateOfBirth().getYear();

        if (course.getTypeCourse().name().contains("CHILDREN") && age > 12) {
            throw new RuntimeException("Age not allowed");
        }

        registration.setSkier(skier);
        registration.setCourse(course);

        return registrationRepository.save(registration);
    }

}
