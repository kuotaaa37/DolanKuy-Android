package com.example.dolankuyandroid.Model;

import java.util.List;

public class ResponseModelDetailListLocations {
    private DataModel detail_location;
    private List<DataModelGallery> currentGallery;

    public DataModel getDetail_location() {
        return detail_location;
    }

    public void setDetail_location(DataModel detail_location) {
        this.detail_location = detail_location;
    }

    public List<DataModelGallery> getCurrentGallery() {

        return currentGallery;
    }

    public void setCurrentGallery(List<DataModelGallery> currentGallery) {

        this.currentGallery = currentGallery;
    }
}
