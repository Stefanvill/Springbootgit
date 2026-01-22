package se.iths.stefan.ovningspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.iths.stefan.ovningspringboot.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
}
