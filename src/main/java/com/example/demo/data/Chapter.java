package com.example.demo.data;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author churinaav
 * @since 14.09.2018
 **/
@Data
@Entity
@RequiredArgsConstructor
public class Chapter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

@Column
@NotNull
    private String name = "test";
}
