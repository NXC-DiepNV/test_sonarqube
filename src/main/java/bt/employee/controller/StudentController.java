package bt.employee.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bt.employee.model.Student;
import bt.employee.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/student/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable(name = "id") Long id) {
        Optional<Student> student = repository.findById(id);

        Map<String, Object> response = new HashMap<String, Object>();
        response.put("data", student);

        return new ResponseEntity<Object>(response, HttpStatus.OK);
    
    }
    
}
