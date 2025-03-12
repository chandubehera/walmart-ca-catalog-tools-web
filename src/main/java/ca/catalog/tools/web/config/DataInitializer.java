package ca.catalog.tools.web.config;

import ca.catalog.tools.web.entity.CurrencyRate;
import ca.catalog.tools.web.repository.CurrencyRateRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/*For Testing - not recommended in live env*/
@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final CurrencyRateRepository currencyRateRepository;

    @PostConstruct
    public void loadData() {
        currencyRateRepository.save(new CurrencyRate(null, "USD", "EUR", 0.85));
        currencyRateRepository.save(new CurrencyRate(null, "USD", "INR", 74.50));
        currencyRateRepository.save(new CurrencyRate(null, "EUR", "INR", 87.30));
        System.out.println("Currency rates preloaded into database!");
    }
}
