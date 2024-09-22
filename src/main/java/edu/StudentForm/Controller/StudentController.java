package edu.StudentForm.Controller;

import edu.StudentForm.modal.Student;
import edu.StudentForm.repository.StudentRespository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow CORS for this controller
public class StudentController {

    @Autowired
    StudentRespository studentRespository;

    @PostMapping("/add-image")
    public void addStudent(
            @RequestPart("name") String name,
            @RequestPart("email") String email,
            @RequestPart("phoneNumber") String phoneNumber,
            @RequestPart("address") String address,
            @RequestPart("province") String province,
            @RequestPart("guardian") String guardian,
            @RequestPart("education") String education,
            @RequestPart("image") MultipartFile image) throws IOException {
        byte[] fileBytes = image.getBytes();

        studentRespository.save(new Student(4, name, email, phoneNumber, address, province, guardian, education, fileBytes));
    }

    @GetMapping("/get-student")
    public List<Student> getStudent(){
        return studentRespository.findAll();
    }
}
