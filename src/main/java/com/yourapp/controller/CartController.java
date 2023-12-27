package com.yourapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    @GetMapping("/cart")
    public String cart() {
        // Implement cart functionality
        return "cart";
    }

    @GetMapping("/checkout")
    public String checkout() {
        // Direct to payment page
        return "payment";
    }
}
