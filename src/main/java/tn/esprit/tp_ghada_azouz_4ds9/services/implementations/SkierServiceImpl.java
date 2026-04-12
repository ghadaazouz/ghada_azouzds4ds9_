package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Course;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Piste;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Registration;
import tn.esprit.tp_ghada_azouz_4ds9.entities.Skier;
import tn.esprit.tp_ghada_azouz_4ds9.entities.enumerate.TypeSubscription;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.CourseRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.PisteRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.RegistrationRepository;
import tn.esprit.tp_ghada_azouz_4ds9.repositories.SkierRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.ISkierService;

import java.util.List;
import java.util.Set;

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

        try{
        skier.getPistes().add(piste);}
        catch(NullPointerException ex){
            Set<Piste> pistesMiseAjour = skier.getPistes();
            pistesMiseAjour.add(piste);
            skier.setPistes(pistesMiseAjour);
        }

        //fils : piste , skier : pere -> affectation dans pere ->skier
        //peut faire une erreur -> on utilise try catch
        skierRepository.save(skier);
    }//on peut utilser hashset faire hashset

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
