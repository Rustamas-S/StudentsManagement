package SDA.Rustamas.practicalProject.service;

import SDA.Rustamas.practicalProject.model.Student;

import java.util.List;

public interface IStudentService {

    Student findById(Long id);

    List<Student> findAll();

    Student saveStudent(Student student);

    void deleteById(Long id);
}