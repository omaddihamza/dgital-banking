package org.sid.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Size(min = 8, message = "Password must be at least 6 characters long")
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    @Temporal(TemporalType.DATE)
    private Date date_of_birth;
    @Embedded
    private Address address;
    private String phone_number;
}