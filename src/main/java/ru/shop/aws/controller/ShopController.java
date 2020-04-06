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
        // отправляем запрос к другому бекенду, получаем ответ
//        return new Product();
        return productRepository.findById(product_id).get();
    }
    @PostMapping("/put/{product_id}")
    public Product putProduct(@PathVariable UUID product_id) {
        // отправляем запрос к другому бекенду, получаем ответ
//        return new Product();
        return productRepository.findById(product_id).get();
    }
}
