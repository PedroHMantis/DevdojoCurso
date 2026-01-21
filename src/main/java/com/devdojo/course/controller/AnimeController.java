package com.devdojo.course.controller;

import com.devdojo.course.domain.Anime;
import com.devdojo.course.service.AnimeService;
import com.devdojo.course.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    private final AnimeService animeService;

    @GetMapping
    public List<Anime> listAnime(){
        log.info(dateUtil.FormatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return animeService.listAll();
    }

}
