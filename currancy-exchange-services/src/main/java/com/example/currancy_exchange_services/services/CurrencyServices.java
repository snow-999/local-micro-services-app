package com.example.currancy_exchange_services.services;

import com.example.currancy_exchange_services.currencyEntity.CurrencyEntity;
import org.springframework.stereotype.Service;


public interface CurrencyServices {
    CurrencyEntity saveCurrency(CurrencyEntity currencyEntity);
}
