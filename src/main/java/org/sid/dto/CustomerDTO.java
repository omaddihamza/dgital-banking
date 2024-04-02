package org.sid.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.sid.entities.Address;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class CustomerDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd-MM-yyyy")
    private Date date_of_birth;
    private Address address;
    private String phone_number;
}