package ru.alfabank.currencyrates.models;

import java.util.List;

public class RateResponse {

    private List<Currencies> currencies;

    public String baseCurrency;

    public String operationId;

    public List<Currencies> getCurrencies() {
        return currencies;
    }
}
