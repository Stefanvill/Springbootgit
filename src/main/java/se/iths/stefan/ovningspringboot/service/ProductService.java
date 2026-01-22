package se.iths.stefan.ovningspringboot.service;

import org.springframework.stereotype.Service;
import se.iths.stefan.ovningspringboot.model.Product;
import se.iths.stefan.ovningspringboot.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> productList() {
        return productRepository.findAll();
    }
}
