package ca.catalog.tools.web.controller;

import ca.catalog.tools.web.dto.*;
import ca.catalog.tools.web.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponse addProduct(@RequestBody ProductRequest request) {
        return productService.addProduct(request);
    }

    @PatchMapping("/price")
    public void updatePrice(@RequestBody PriceUpdateRequest request) {
        productService.updatePrice(request);
    }

    @PatchMapping("/stock")
    public void updateStock(@RequestBody StockUpdateRequest request) {
        productService.updateStock(request);
    }

    @PatchMapping("/attributes")
    public void updateAttributes(@RequestBody AttributeUpdateRequest request) {
        productService.updateAttributes(request);
    }
}

