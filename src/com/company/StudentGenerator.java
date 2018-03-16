package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentGenerator {

    public StudentGenerator(){

    }

    public List<Student> generateStudentList(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("15.11.8570", "Nama 1", "TI02", "active"));
        students.add(new Student("15.11.8571", "Nama 2", "TI03", "alumni"));
        students.add(new Student("15.11.8570", "Nama 3", "TI02", "active"));
        students.add(new Student("15.11.8571", "Nama 4", "TI03", "alumni"));
        students.add(new Student("15.11.8570", "Nama 5", "TI02", "active"));
        students.add(new Student("15.11.8571", "Nama 6", "TI03", "alumni"));

        return students;

    }
}
