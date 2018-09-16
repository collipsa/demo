package com.example.demo.web.controllers;

import com.example.demo.data.Chapter;
import com.example.demo.data.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author churinaav
 * @since 14.09.2018
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/chapters")
public class UserController {

    private final ChapterRepository chapterRepository;

    @GetMapping
    public List<Chapter> list(){
        return chapterRepository.findAll();
    }

    @PostMapping
    public Chapter add (Chapter chapter){return chapterRepository.save(chapter);}
}
