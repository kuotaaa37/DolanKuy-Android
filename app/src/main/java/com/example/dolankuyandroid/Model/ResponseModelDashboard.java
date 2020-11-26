package com.example.dolankuyandroid.Model;

import java.util.List;

public class ResponseModelDashboard {
    private List<DataModel> acomodation;

    public List<DataModel> getLocation() {

        return acomodation;
    }

    public void setLocation(List<DataModel> location) {

        this.acomodation = location;
    }
}
