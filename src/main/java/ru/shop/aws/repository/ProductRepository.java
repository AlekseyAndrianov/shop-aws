package ru.shop.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shop.aws.entity.Product;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

//    @Query("SELECT p FROM Product p where p.product_id = :product_id")
//    Optional<Product> findById(@Param("product_id") UUID product_id);

//    @Query(value = "INSERT INTO Product (product_id, name, article, size, color, price) values (:product_id, :name, :article, :size, :color, :price)", nativeQuery = true)
//    <S extends Product> S save(
//            @Param("product_id") UUID product_id,
//            @Param("name") String name,
//            @Param("article") String article,
//            @Param("size") String size,
//            @Param("color") String color,
//            @Param("price") Double price);

//    @Override
//    @Query("select count(*) from Product")
//    long count();
}