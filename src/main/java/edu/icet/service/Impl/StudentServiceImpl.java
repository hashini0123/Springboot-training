package edu.icet.service.Impl;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(StudentDto student) {

    }

    @Override
    public void update(StudentDto student) {

    }

    @Override
    public void delete(StudentDto student) {

    }

    @Override
    public StudentDto searchById(StudentDto student) {
        return null;
    }

    @Override
    public List<StudentDto> getAll() {
        return List.of();
    }

    @Override
    public List<StudentDto> searchByName(String name) {
        return List.of();
    }
}
