package ca.catalog.tools.web.service;

import ca.catalog.tools.web.dto.*;
import ca.catalog.tools.web.entity.Product;
import ca.catalog.tools.web.exception.ProductNotFoundException;
import ca.catalog.tools.web.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse addProduct(ProductRequest request) {
        Product product = Product.builder()
                .sku(request.getSku())
                .name(request.getName())
                .price(request.getPrice())
                .stock(request.getStock())
                .attributes(request.getAttributes())
                .build();
        productRepository.save(product);
        return new ProductResponse(product.getSku(), product.getName(), product.getPrice(), product.getStock(), product.getAttributes());
    }

    @Transactional
    public void updatePrice(PriceUpdateRequest request) {
        Product product = productRepository.findBySku(request.getSku())
                .orElseThrow(() -> new ProductNotFoundException("Product not found with SKU: " + request.getSku()));
        product.setPrice(request.getNewPrice());
    }

    @Transactional
    public void updateStock(StockUpdateRequest request) {
        Product product = productRepository.findBySku(request.getSku())
                .orElseThrow(() -> new ProductNotFoundException("Product not found with SKU: " + request.getSku()));
        product.setStock(request.getNewStock());
    }

    @Transactional
    public void updateAttributes(AttributeUpdateRequest request) {
        Product product = productRepository.findBySku(request.getSku())
                .orElseThrow(() -> new ProductNotFoundException("Product not found with SKU: " + request.getSku()));
        product.getAttributes().putAll(request.getUpdatedAttributes());
    }
}
