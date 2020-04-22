package com.NewTest.API_Models.cryptocurency.info;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.*;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Urls {

    private List<String> technical_doc;

    public List<String> getTechnical_doc() {
        return technical_doc;
    }

    public void setTechnical_doc(List<String> technical_doc) {
        this.technical_doc = technical_doc;
    }

    @Override
    public String toString() {
        return "Urls{" +
                "technical_doc=" + technical_doc +
                '}';
    }
}
