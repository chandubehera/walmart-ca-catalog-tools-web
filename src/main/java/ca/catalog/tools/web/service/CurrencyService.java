package ca.catalog.tools.web.service;

import ca.catalog.tools.web.dto.CurrencyConversionRequest;
import ca.catalog.tools.web.dto.CurrencyConversionResponse;
import ca.catalog.tools.web.entity.CurrencyRate;
import ca.catalog.tools.web.exception.CurrencyNotFoundException;
import ca.catalog.tools.web.repository.CurrencyRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyRateRepository currencyRateRepository;

    @Transactional
    public CurrencyConversionResponse convertCurrency(CurrencyConversionRequest request) {
        CurrencyRate rate = currencyRateRepository.findByBaseCurrencyAndTargetCurrency(
                        request.getBaseCurrency(), request.getTargetCurrency())
                .orElseThrow(() -> new CurrencyNotFoundException("Exchange rate not found for: "
                        + request.getBaseCurrency() + " to " + request.getTargetCurrency()));

        double convertedAmount = request.getAmount() * rate.getExchangeRate();
        return new CurrencyConversionResponse(request.getBaseCurrency(), request.getTargetCurrency(),
                request.getAmount(), convertedAmount);
    }
}
