package com.NewTest.API_Models.cryptocurency.info;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private Map<String,InfoID> infoTechnicalDocumentations;

    public Map<String, InfoID> getInfoTechnicalDocumentations() {
        return infoTechnicalDocumentations;
    }

    @JsonAnySetter
    public void setInfoTechnicalDocumentations(String id, InfoID infoObject) {
       infoTechnicalDocumentations.put(id,infoObject);
    }

    @Override
    public String toString() {
        return "Data{" +
                "infoTechnicalDocumentations=" + infoTechnicalDocumentations +
                '}';
    }
}
