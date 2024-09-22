package edu.StudentForm.modal;

import com.mysql.cj.jdbc.Blob;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity()
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int StudentID;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String province;
    private String guardian;
    private String education;
    @Lob
    private byte[] image;


}
