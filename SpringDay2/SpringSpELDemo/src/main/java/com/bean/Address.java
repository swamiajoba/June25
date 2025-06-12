package com.bean;

public class Address {
    private String city;
    public Address() {}
    public Address(String city) { this.city = city; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    @Override
    public String toString() { return "City: " + city; }
}