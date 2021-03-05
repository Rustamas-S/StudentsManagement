package SDA.Rustamas.practicalProject.repository;

import SDA.Rustamas.practicalProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
