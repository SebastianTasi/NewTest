package com.NewTest.API_Models.cryptocurency.map;

import java.util.*;

import com.NewTest.API_Models.cryptocurency.map.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MapResponse {

    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
