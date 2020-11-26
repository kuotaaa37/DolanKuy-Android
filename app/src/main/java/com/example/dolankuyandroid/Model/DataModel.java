package com.example.dolankuyandroid.Model;

import com.google.gson.annotations.SerializedName;

public class DataModel {

@SerializedName("id")
private int id;

@SerializedName("name")
private String name;

@SerializedName("address")
private String address;

@SerializedName("description")
private String description;

@SerializedName("category_id")
private int category_id;

@SerializedName("contact")
private double contact;

@SerializedName("latitude")
private float latitude;

@SerializedName("longitude")
private float longitude;

@SerializedName("distance")
private int distance;

    public int getId() {
        return id;
    }

    public void setId(int userId) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}