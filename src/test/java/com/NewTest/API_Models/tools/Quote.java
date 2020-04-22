package com.NewTest.API_Models.tools;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

   Map<String, SymbolConversion> currencySymbols = new HashMap<>();

    public Map<String, SymbolConversion> getCurrencySymbols() {
        return currencySymbols;
    }

    @JsonAnySetter
    public void setBob(String objName , SymbolConversion objectOfSymbol) {
        currencySymbols.put(objName,objectOfSymbol);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "bob=" + currencySymbols +
                '}';
    }
}

