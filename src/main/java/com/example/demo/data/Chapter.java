package com.example.demo.data;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author churinaav
 * @since 14.09.2018
 **/
@Data
@Entity
@RequiredArgsConstructor
public class Chapter implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    @NotNull
    private String name;
}
