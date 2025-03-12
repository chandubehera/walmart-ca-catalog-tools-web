package ca.catalog.tools.web.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class ProductRequest {
    private String sku;
    private String name;
    private BigDecimal price;
    private int stock;
    private Map<String, String> attributes;
}

