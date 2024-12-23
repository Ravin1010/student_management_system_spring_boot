package com.example.sms.service;

import com.example.sms.domain.Student;
import com.example.sms.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;
    
    public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student student) {
        repo.save(student);
    }
     
    public Student get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
