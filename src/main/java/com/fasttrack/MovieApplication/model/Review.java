package com.fasttrack.MovieApplication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Review {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String text;
    @Column
    private String reviewer;

    @ManyToOne
    @JsonIgnore
    private Movie movie;
}
