package com.example.currancy_exchange_services.controller;


import com.example.currancy_exchange_services.currencyEntity.CurrencyEntity;
import com.example.currancy_exchange_services.repository.CurrencyExchangeRepository;
import com.example.currancy_exchange_services.services.CurrencyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;
    @Autowired
    private CurrencyServices currencyServices;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyEntity retrieveExchangeValue(@PathVariable String to, @PathVariable String from) {
        CurrencyEntity entity = new CurrencyEntity();
        entity.setTo(to);
        entity.setId(2);
        entity.setFrom(from);
        entity.setConversionMultiple(BigDecimal.valueOf(50));
        entity = currencyServices.saveCurrency(entity);
        String port = environment.getProperty("local.server.port");
        CurrencyEntity currencyEntity = currencyExchangeRepository.findByFromAndTo(from, to);
        if (currencyEntity == null) {
            throw new RuntimeException("there is no data saved in data base");
        }

        entity.setEnvironment(port);
        return currencyEntity;
    }
}
