package com.example.springbootbackend.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
