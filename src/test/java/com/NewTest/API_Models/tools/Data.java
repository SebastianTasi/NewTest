package com.NewTest.API_Models.tools;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {


    private  String symbol;
    private int id;
    private String name;
    private int amount;
    private String last_updated;
    private Quote quote;



    @Override
    public String toString() {
        return "Data{" +
                "symbol='" + symbol + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", last_updated='" + last_updated + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }
}
