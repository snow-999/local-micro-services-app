package com.example.currancy_exchange_services.services.currencyServicesImpl;

import com.example.currancy_exchange_services.currencyEntity.CurrencyEntity;
import com.example.currancy_exchange_services.repository.CurrencyExchangeRepository;
import com.example.currancy_exchange_services.services.CurrencyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServicesImpl implements CurrencyServices {
    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;
    @Override
    public CurrencyEntity saveCurrency(CurrencyEntity currencyEntity) {
        currencyEntity = currencyExchangeRepository.save(currencyEntity);
        return currencyEntity;
    }
}
