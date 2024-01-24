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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateDeNaissance;
    private String telephone;
    private String email;
    private Genre genre;
}