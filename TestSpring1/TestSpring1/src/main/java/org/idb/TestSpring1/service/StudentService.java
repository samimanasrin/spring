package org.idb.TestSpring1.service;


import org.idb.TestSpring1.entity.Student;
import org.idb.TestSpring1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService  {
    @Autowired
    private StudentRepository repo;
    public List<Student> getAll(){

        return repo.findAll();

    }

    public void save(Student s){
        repo.save(s);
    }
    public void delete(int id){
        repo.deleteById(id);

    }
    public void update(Student s, int id){
        repo.save(s);

    }


}
