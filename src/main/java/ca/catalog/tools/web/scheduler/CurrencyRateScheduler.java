package ca.catalog.tools.web.scheduler;

import ca.catalog.tools.web.entity.CurrencyRate;
import ca.catalog.tools.web.repository.CurrencyRateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class CurrencyRateScheduler {

    private final CurrencyRateRepository currencyRateRepository;

    @Scheduled(cron = "0 0 0 * * ?") // Runs daily at midnight
    public void refreshCurrencyRates() {
        // Mock API Call (Replace with actual third-party API call)
        currencyRateRepository.save(new CurrencyRate(null, "USD", "EUR", new Random().nextDouble() + 0.8));
        currencyRateRepository.save(new CurrencyRate(null, "EUR", "USD", new Random().nextDouble() + 1.1));
        System.out.println("Currency rates refreshed!");
    }
}
