package org.idb.TestSpring1.restcontroller;


import org.idb.TestSpring1.entity.Student;
import org.idb.TestSpring1.exphandelar.ResourceNotFoundException;
import org.idb.TestSpring1.repository.StudentRepository;
import org.idb.TestSpring1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import sun.print.resources.serviceui;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/student")

public class StudentRestController {

    @Autowired
    public StudentService studentService;

    @Autowired
    public StudentRepository repo;

    @GetMapping("/all")
    public List<Student> list() {
        return studentService.getAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student s) {
        studentService.save(s);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        studentService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Student s, @PathVariable("id") int id) {
        studentService.update(s, id);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable("id") int id){
        Student student=repo.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Employee not found for this id :: " +  id));
                return ResponseEntity.ok().body(student);
    }
}