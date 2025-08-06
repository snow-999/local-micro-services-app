package com.example.currancy_exchange_services.repository;

import com.example.currancy_exchange_services.currencyEntity.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository  extends JpaRepository<CurrencyEntity, Long> {
    CurrencyEntity findByFromAndTo(String from, String to);
}
