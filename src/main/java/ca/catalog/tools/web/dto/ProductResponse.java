package ca.catalog.tools.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
@AllArgsConstructor
public class ProductResponse {
    private String sku;
    private String name;
    private BigDecimal price;
    private int stock;
    private Map<String, String> attributes;
}
