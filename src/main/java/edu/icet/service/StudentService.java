package edu.icet.service;

import edu.icet.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDto student);
    void updateStudent(StudentDto student);
    void deleteStudent(StudentDto student);
    StudentDto searchById(StudentDto student);
    List<StudentDto> getAll();
    List<StudentDto> searchByName(String name);


}
