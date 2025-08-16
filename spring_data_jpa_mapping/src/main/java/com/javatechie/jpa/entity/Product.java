package com.javatechie.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "products")   // 👈 optional but good practice
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment in PostgreSQL
    private int pid;

    private String productName;
    private int qty;
    private int price;
}
