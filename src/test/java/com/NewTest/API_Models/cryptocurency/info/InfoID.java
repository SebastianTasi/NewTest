package com.NewTest.API_Models.cryptocurency.info;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.*;


@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoID {


    private String logo;
    private Urls urls;
    private String symbol;
    private String date_added;
    private String platform;
    private List<String> tags;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "InfoID{" +
                "logo='" + logo + '\'' +
                ", urls=" + urls +
                ", symbol='" + symbol + '\'' +
                ", date_added='" + date_added + '\'' +
                ", platform='" + platform + '\'' +
                ", tags=" + tags +
                '}';
    }
}
