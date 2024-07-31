package com.example.school.repository;

import java.util.*;
import com.example.school.model.Student;

public interface StudentRepository {
    ArrayList<Student> getStudents();

    Student addStudent(Student student);

    Student getStudentById(int studentId);

    Student updateStudent(int studentId, Student Student);

    void deleteStudent(int studentId);
}