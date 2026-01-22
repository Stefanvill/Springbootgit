package se.iths.stefan.ovningspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import se.iths.stefan.ovningspringboot.model.Product;
import se.iths.stefan.ovningspringboot.service.ProductService;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/inventory")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.productList());
        return "product";
    }

}
