package edu.icet.service.Impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addStudent(StudentDto student) {
        StudentEntity entity=modelMapper.map(student, StudentEntity.class);
        studentRepository.save(entity);
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
