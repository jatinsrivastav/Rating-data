package com.Ratingdata.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRating {
    public List<Rating> getUserrating() {
        return userrating;
    }

    public void setUserrating(List<Rating> userrating) {
        this.userrating = userrating;
    }

    private List<Rating> userrating;

}
