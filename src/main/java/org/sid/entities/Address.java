package org.sid.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private String street;
    private String city;
    private String zip;
}
