package org.example;

public class Main {
    public static void main(String[] args) {

        StudentService MathStudentService = new MathStudentService();
        StudentService BioStudentService = new BioStudentService();

        StudentController studentController = new StudentController(MathStudentService);

        System.out.println(studentController.sayHello());

    }
}