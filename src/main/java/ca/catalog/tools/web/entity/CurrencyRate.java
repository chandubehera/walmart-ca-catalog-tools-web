package ca.catalog.tools.web.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "currency_rates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CurrencyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String baseCurrency;

    @Column(nullable = false)
    private String targetCurrency;

    @Column(nullable = false)
    private double exchangeRate;
}
