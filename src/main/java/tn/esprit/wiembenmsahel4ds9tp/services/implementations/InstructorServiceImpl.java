package tn.esprit.wiembenmsahel4ds9tp.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.wiembenmsahel4ds9tp.entities.Instructor;
import tn.esprit.wiembenmsahel4ds9tp.repositories.InstructorRepository;
import tn.esprit.wiembenmsahel4ds9tp.services.interfaces.IInstructorService;

import java.util.List;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IInstructorService {

    private final InstructorRepository instructorRepository;

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructor(Long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public Instructor getInstructor(Long id) {
        //Methode1
        // return InstructorRepository.findById(id).get();
        //Methode2
        return instructorRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Instructor avec l'id " + id + " est introuvable"));
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }
}
