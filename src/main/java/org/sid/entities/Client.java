package org.sid.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.enumeration.Genre;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
        @Id
        @GeneratedValue
        private Long code;
        private String nom;
        private String prenom;
        @Temporal(TemporalType.DATE)
        private Date dateDeNaissance;
        private String telephone;
        private String email;
        @Enumerated(EnumType.STRING)
        private Genre genre;
}
