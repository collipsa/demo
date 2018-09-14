package com.example.demo.data;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author churinaav
 * @since 14.09.2018
 **/
@Data
@Entity
public class User {

    private String name = "test";
}
