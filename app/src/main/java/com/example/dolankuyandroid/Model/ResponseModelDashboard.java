package com.example.dolankuyandroid.Model;

import java.util.List;

public class ResponseModelDashboard {
    private List<DataModelDashboard> locations;

    public List<DataModelDashboard> getLocation() {

        return locations;
    }

    public void setLocation(List<DataModelDashboard> location) {

        this.locations = location;
    }
}
