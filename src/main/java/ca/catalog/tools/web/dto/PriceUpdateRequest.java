package ca.catalog.tools.web.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PriceUpdateRequest {
    private String sku;
    private BigDecimal newPrice;
}

