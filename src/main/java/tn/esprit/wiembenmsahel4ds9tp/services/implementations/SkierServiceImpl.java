package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Course;
import tn.esprit.wiembenmsahel4ds9tp.entities.Piste;
import tn.esprit.wiembenmsahel4ds9tp.entities.Registration;
import tn.esprit.wiembenmsahel4ds9tp.entities.Skier;
import tn.esprit.wiembenmsahel4ds9tp.entities.enumerate.TypeSubscription;
import tn.esprit.wiembenmsahel4ds9tp.repositories.CourseRepository;
import tn.esprit.wiembenmsahel4ds9tp.repositories.PisteRepository;
import tn.esprit.wiembenmsahel4ds9tp.repositories.RegistrationRepository;
import tn.esprit.wiembenmsahel4ds9tp.repositories.SkierRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.ISkierService;

import java.util.List;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierService {

    private final SkierRepository skierRepository;
    private final PisteRepository pisteRepository;
    private final CourseRepository courseRepository;
    private final RegistrationRepository registrationRepository;

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void deleteSkier(Long id) {
        skierRepository.deleteById(id);
    }

    @Override
    public Skier getSkier(Long id) {
        //Methode1
        // return SkierRepository.findById(id).get();
        //Methode2
        return skierRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Skier avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Skier> getAllSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public void assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier)
                .orElseThrow(() -> new RuntimeException("Skier not found"));

        Piste piste = pisteRepository.findById(numPiste)
                .orElseThrow(() -> new RuntimeException("Piste not found"));

        skier.getPistes().add(piste);

        skierRepository.save(skier);
    }

    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        // save skier (subscription auto grâce au cascade)
        Skier savedSkier = skierRepository.save(skier);

        // créer registration
        Registration registration = new Registration();
        registration.setNumWeek(1);
        registration.setSkier(savedSkier);
        registration.setCourse(course);

        registrationRepository.save(registration);

        return savedSkier;
    }

    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription type) {
        return skierRepository.findBySubscription_TypeSub(type);
    }

}
