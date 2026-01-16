package edu.icet.controller;


import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


   @Autowired
    StudentService service;

    @PostMapping
    public void addStudent(@RequestBody StudentDto studentDto){
        service.addStudent(studentDto);
    }

    @GetMapping("/update")
    public void updateStudent(@RequestBody StudentDto studentDto){
        service.updateStudent(studentDto);
    }

    @GetMapping("/delete")
    public void delteById (@RequestBody StudentDto studentDto){
        service.deleteStudent(studentDto);
    }

//    @GetMapping("/search-by-id")
//    public List<StudentDto>getAll(){
//        return s
//    }

}
