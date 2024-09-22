package edu.StudentForm.repository;

import edu.StudentForm.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Integer> {
}
