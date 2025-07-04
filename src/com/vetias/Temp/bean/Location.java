package com.vetias.Temp.bean;

public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String description;
    private String country;
    private String city;
    private String address;
    private String  postalcode;

    public void  setName(String aName){
        name = aName;
    }
    public String getName(){
        return name;
    }
      
    public void setlatitude(double aLatitude){
             latitude =aLatitude;
    }
    public double getLatitude(){
        return latitude;
    }
    public void setlongitude( double aLongitude){
        longitude =aLongitude;

    }
    public double setlongitude(){
        return longitude;
    }
    public void setDescription(String aDescription){
        description =aDescription;
    }
    public String setDescription(){
        return description;
    }
    public void setCountry(String aCountry){
        country = aCountry;
    }
    public String setCountry(){
        return country;
    }
    public void setCity(String aCity){
        city = aCity;
    }
    public String setCity(){
        return city;
    }
    public void setAddress(String aAddress){
        address = aAddress;
    }
    public String setAddress(){
        return address;
    }
    public void setPostalcode(String aPostalcode){
        postalcode = aPostalcode;
    }
    public String setPostalcode(){
        return postalcode;
    }

    @Override
    public String toString(){
        return "Location { name:" + name +
               ", Latitude: " + latitude +
               ", Longitude: " + longitude +
               ", Description: " + description +
               ", Country: " + country +
               ", City: " + city +
               ",  Address: " + address +
               ",  Postalcode: " + postalcode +
    
    }


}
 





