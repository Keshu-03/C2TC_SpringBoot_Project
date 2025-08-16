package com.javatechie.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.*;   // ✅ use jakarta for Spring Boot 3+
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customers")   // 👈 optional, gives a clear table name
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment id
    private int id;

    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id") // FK in Product table
    private List<Product> products;
}
