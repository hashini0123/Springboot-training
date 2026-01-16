package edu.icet.service.Impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void updateStudent(StudentDto student) {
        StudentEntity entity = modelMapper.map(student, StudentEntity.class);
        studentRepository.save(entity);
        
    }

    @Override
    public void deleteStudent(StudentDto student) {
        Integer id = 0;
        studentRepository.deleteById(id);
    }
    
    @Override
    public StudentDto searchById(StudentDto student) {
        Integer id = 0;
        StudentEntity studentEntity = studentRepository.findById(id).get();
        StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);
        return studentDto;
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> studentEntities = studentRepository.findAll();
        ArrayList<StudentDto> studentDtoArrayList = new ArrayList<>();
        studentEntities.forEach(studentEntity ->{
            StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);
            studentDtoArrayList.add(studentDto);
        });
    }

    @Override
    public List<StudentDto> searchByName(String name) {
        return List.of();
    }
}
