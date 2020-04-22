package com.NewTest.API_Models.tools;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SymbolConversion {

    private double price;
    private String last_updated;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    @Override
    public String toString() {
        return "BOB{" +
                "price=" + price +
                ", last_updated='" + last_updated + '\'' +
                '}';
    }
}
