package ca.catalog.tools.web.controller;

import ca.catalog.tools.web.dto.CurrencyConversionRequest;
import ca.catalog.tools.web.dto.CurrencyConversionResponse;
import ca.catalog.tools.web.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/currency")
@RequiredArgsConstructor
public class CurrencyController {

    private final CurrencyService currencyService;

    @PostMapping("/convert")
    public CurrencyConversionResponse convertCurrency(@RequestBody CurrencyConversionRequest request) {
        return currencyService.convertCurrency(request);
    }


}

