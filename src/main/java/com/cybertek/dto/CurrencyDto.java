package com.cybertek.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrencyDto{

    private Rates rates;



}