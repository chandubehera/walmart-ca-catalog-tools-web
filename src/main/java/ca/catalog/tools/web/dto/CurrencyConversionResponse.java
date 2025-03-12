package ca.catalog.tools.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrencyConversionResponse {
    private String baseCurrency;
    private String targetCurrency;
    private double amount;
    private double convertedAmount;
}
