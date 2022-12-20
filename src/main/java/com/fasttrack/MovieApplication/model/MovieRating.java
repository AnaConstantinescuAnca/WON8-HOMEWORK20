package com.fasttrack.MovieApplication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@Data
public class MovieRating {
    @Id
    @GeneratedValue
    private Integer id ;
    @Column
    private int rating;
    @Column
    private String agency;

    @OneToOne(mappedBy = "movieRating")
    @JsonIgnore
    private Movie movie;

}
