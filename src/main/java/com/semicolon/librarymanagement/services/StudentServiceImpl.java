package com.semicolon.librarymanagement.services;

import com.semicolon.librarymanagement.models.Student;
import com.semicolon.librarymanagement.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public StudentDto createStudent(CreateStudentDto createStudentRequest) {
        Student student = modelMapper.map(createStudentRequest, Student.class);
        StudentDto  studentDto = modelMapper.map(student,StudentDto.class);
        return studentDto;


    }
}
