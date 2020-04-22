package com.NewTest.API_Models.cryptocurency.map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {


    private int id;
    private String name;
    private String symbol;
    private String slug;
    private int is_active; //acting as a boolean
    private int rank;
    private String first_historical_data;
    private String last_historical_data;
    private Platfrom platform;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFirst_historical_data() {
        return first_historical_data;
    }

    public void setFirst_historical_data(String first_historical_data) {
        this.first_historical_data = first_historical_data;
    }

    public String getLast_historical_data() {
        return last_historical_data;
    }

    public void setLast_historical_data(String last_historical_data) {
        this.last_historical_data = last_historical_data;
    }

    public Platfrom getPlatform() {
        return platform;
    }

    public void setPlatform(Platfrom platform) {
        this.platform = platform;
    }
}
