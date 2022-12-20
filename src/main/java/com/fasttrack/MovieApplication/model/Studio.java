package com.fasttrack.MovieApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Entity
@Data
public class Studio {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String address;

//    @OneToMany(mappedBy = "studio", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
//    private List<Movie> movies;

}
