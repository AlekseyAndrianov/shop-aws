package ru.shop.aws.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID product_id;
    private String name;
    private String article;
    private String size;
    private String color;
    private double price;
}
