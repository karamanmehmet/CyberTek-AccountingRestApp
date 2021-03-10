package com.cybertek.controller;

import com.cybertek.dto.CurrencyDto;
import com.cybertek.dto.Rates;
import com.cybertek.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @GetMapping("/api/rates")
    @PreAuthorize("isAuthenticated()")
    public Rates exchange(){
        return  exchangeService.exchangeRates().getRates();
    }
}
