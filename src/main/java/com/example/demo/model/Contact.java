package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String photo;
}
