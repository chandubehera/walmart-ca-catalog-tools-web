package ca.catalog.tools.web.dto;


import lombok.Data;

@Data
public class StockUpdateRequest {
    private String sku;
    private int newStock;
}

