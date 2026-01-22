package se.iths.stefan.ovningspringboot.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import se.iths.stefan.ovningspringboot.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> productList() {
        ArrayList<Product> productList = new ArrayList<>();
        Product milk = new Product(1, "Milk", 25.90, 5);
        Product butter = new Product(2, "Butter", 55, 22);
        productList.add(milk);
        productList.add(butter);

        return productList;
    }
}
