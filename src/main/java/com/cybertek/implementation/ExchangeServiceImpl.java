package com.cybertek.implementation;

import com.cybertek.dto.CurrencyDto;
import com.cybertek.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService {


    private WebClient webClient;

    @Autowired
    public ExchangeServiceImpl(@Qualifier("exchangeRestService") WebClient webClient) {
        this.webClient = webClient;
    }


    @Override
    public CurrencyDto exchangeRates() {

         return   webClient
                    .get()
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToMono(CurrencyDto.class)
                    .block();




    }
}
