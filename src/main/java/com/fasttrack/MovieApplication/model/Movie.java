package com.fasttrack.MovieApplication.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Data

public class Movie {
    public Movie(Integer id, String name, int year, MovieRating movieRating, List<Review> reviews, Studio studio, List<Actor> actors) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.movieRating = movieRating;
        this.reviews = reviews;
        this.studio = studio;
        this.actors = actors;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private int year;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private MovieRating movieRating;

    @OneToMany(mappedBy = "movie", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Review> reviews;

    @ManyToOne
    private Studio studio;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private List<Actor> actors;

}
