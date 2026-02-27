package tn.esprit.tp_ghada_azouz_4ds9.services.implementations;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_ghada_azouz_4ds9.entity.Instructor;
import tn.esprit.tp_ghada_azouz_4ds9.repository.InstructorRepository;
import tn.esprit.tp_ghada_azouz_4ds9.services.interfaces.IinstructorService;

import java.util.List;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IinstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }
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
        return instructorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + id));
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }
}
