package com.semicolon.librarymanagement.services;

import com.semicolon.librarymanagement.models.Student;
import com.semicolon.librarymanagement.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentServiceImplTest {


    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp(){
        CreateStudentDto  createStudentRequest = new CreateStudentDto();
        studentService.createStudent(createStudentRequest);

    }
    @Test
    public  void testThatStudentServiceWorks(){
        StudentService studentService = new StudentServiceImpl();
        assertThat(studentService).isNotNull();
    }
    @Test
    public void testThatContextLoadService(){
        assertThat(studentService).isNotNull();
    }
    @Test
    public void textThatStudentCanBeCreated(){
        CreateStudentDto createStudentRequest = new CreateStudentDto();
        StudentDto createStudentResponse = studentService.createStudent(createStudentRequest);
        assertThat(createStudentResponse).isNotNull();

    }
    @Test
    void testThatStudentCanBePersisted() {
      Optional<Student> student = studentRepository.findById(1L);
      assertThat(student).isNotEmpty();

    }
}