package com.xyz.dto;

public class AddressDto {

    private String street;

    private String housenumber;

    private String postalcode;

    private String city;

    private GeoLocationDto geoLocation;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public GeoLocationDto getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocationDto geoLocation) {
        this.geoLocation = geoLocation;
    }
}
