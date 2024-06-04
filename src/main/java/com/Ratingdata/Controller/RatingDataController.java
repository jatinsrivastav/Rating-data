package com.Ratingdata.Controller;

import com.Ratingdata.model.Rating;
import com.Ratingdata.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataController {

    @Autowired
    UserRating userRating;

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,8);
    }

    @GetMapping("users/{userid}")
    public UserRating getraing(@PathVariable("userid") String userid){
        List<Rating> ratings = Arrays.asList(new Rating("123",6), new Rating("444",9));

        userRating.setUserrating(ratings);
        return userRating;
    }
}
