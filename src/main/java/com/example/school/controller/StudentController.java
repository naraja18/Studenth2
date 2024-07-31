package com.example.school.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.school.model.Student;
import com.example.school.service.StudentH2Service;

@RestController
public class StudentController {
   @Autowired
   public StudentH2Service apiService;

   @GetMapping("/students")
   public ArrayList<Student> getStudents() {
      return apiService.getStudents();
   }

   @PostMapping("/students")
   public Student addStudent(@RequestBody Student student) {
      return apiService.addStudent(student);
   }

   @PostMapping("/students/bulk")
   public Student addBulkStudent(@RequestBody Student student) {
      return apiService.addBulkStudent(student);
   }

   @GetMapping("students/{studentId}")
   public Student getStudentById(@PathVariable("studentId") int studentId) {
      return apiService.getStudentById(studentId);
   }

   @PutMapping("students/{studentId}")
   public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
      return apiService.updateStudent(studentId, student);
   }

   @DeleteMapping("students/{studentId}")
   public void deleteStudent(@PathVariable("studentId") int studentId) {
      apiService.deleteStudent(studentId);
   }

}