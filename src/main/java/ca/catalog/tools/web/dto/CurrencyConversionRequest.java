package ca.catalog.tools.web.dto;

import lombok.Data;

@Data
public class CurrencyConversionRequest {
    private String baseCurrency;
    private String targetCurrency;
    private double amount;
}

