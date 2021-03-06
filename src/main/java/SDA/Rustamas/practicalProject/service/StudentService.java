package SDA.Rustamas.practicalProject.service;


import SDA.Rustamas.practicalProject.model.Student;
import SDA.Rustamas.practicalProject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    //    @Autowired - nuo Spring naujos versijos nereikia
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findById(Long id) {
        return studentRepository.getOne(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}