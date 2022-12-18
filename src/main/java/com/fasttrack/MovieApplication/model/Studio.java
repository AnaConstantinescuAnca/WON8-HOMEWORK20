package com.fasttrack.MovieApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class Studio {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String address;

}
