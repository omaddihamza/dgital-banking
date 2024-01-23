package org.sid.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
        @Id
        @GeneratedValue
        private Long code;
        private String nom;
        private String email;
        @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
        private Collection<Compte> comptes;
}
