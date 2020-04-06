package ru.shop.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.shop.aws.entity.Product;
import ru.shop.aws.repository.ProductRepository;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ShopController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/{product_id}")
    public Product getProduct(@PathVariable UUID product_id) {
        return productRepository.findById(product_id).get();
    }
    @PostMapping("/new")
    public Product putProduct() {
        Product product = new Product();
        product.setName(String.format("New product %d" + (productRepository.count() + 1)));
        product.setArticle(String.format("New article %d" + (productRepository.count() + 1)));
        product.setColor("blue");
        product.setPrice(1000.0);
        product.setSize("M");
        productRepository.save(product.getName(), product.getArticle(), product.getSize(), product.getColor(), product.getPrice());
        return product;
    }
}
