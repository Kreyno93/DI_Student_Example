package org.example;

public class BioStudentService implements StudentService {
    @Override
    public String sayHello() {
        return "Hello I am a Bio Student";
    }
}
