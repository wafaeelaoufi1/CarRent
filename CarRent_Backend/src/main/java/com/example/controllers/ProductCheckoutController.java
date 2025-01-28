package com.example.controllers;
/*
import com.example.dtos.ProductRequest;
import com.example.dtos.StripeResponse;
import com.example.services.StripeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1")
public class ProductCheckoutController {


    private final StripeService stripeService;

    @Autowired
    public ProductCheckoutController(StripeService stripeService) {

        this.stripeService = stripeService;
        System.out.println("ProductCheckoutController initialized");
    }

    @PostMapping("/checkout")
    public ResponseEntity<StripeResponse> checkoutProducts(@RequestBody ProductRequest productRequest) {
        StripeResponse stripeResponse = stripeService.checkoutProducts(productRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(stripeResponse);
    }
}
*/