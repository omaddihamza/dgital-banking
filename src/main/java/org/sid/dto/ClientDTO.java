package org.sid.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.sid.enumeration.Genre;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Data
public class ClientDTO {
    private Long code;
    private String nom;
    private String prenom;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE,pattern = "dd-MM-yyyy")
    private Date dateDeNaissance;
    private String telephone;
    private String identifiant;
    private String email;
    private Genre genre;
}