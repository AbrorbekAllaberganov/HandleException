package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.exception.ApiRequestException;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        throw new ApiRequestException("Handle Exception is working");
//        return studentService.getAll();
    }

}
