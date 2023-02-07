package org.example;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public String sayHello(){
        return studentService.sayHello();
    }

}
