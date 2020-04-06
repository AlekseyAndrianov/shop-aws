package ru.shop.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.shop.aws.entity.Product;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    @Override
    @Query("SELECT p FROM Product p where p.product_id = :product_id")
    Optional<Product> findById(@Param("product_id") UUID product_id);

    @Override
    void deleteById(@Param("product_id") UUID product_id);
}
