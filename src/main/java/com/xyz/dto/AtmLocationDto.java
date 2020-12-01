package com.xyz.dto;

import java.util.ArrayList;
import java.util.List;

public class AtmLocationDto {

    private AddressDto address;

    private Integer distance;

    private ArrayList<String> functionality;

    private String type;

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public ArrayList<String> getFunctionality() {
        return functionality;
    }

    public void setFunctionality(ArrayList<String> functionality) {
        this.functionality = functionality;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
