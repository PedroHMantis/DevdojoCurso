package com.devdojo.course.controller;

import com.devdojo.course.domain.Anime;
import com.devdojo.course.service.AnimeService;
import com.devdojo.course.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Anime>> listAnime(){
        log.info(dateUtil.FormatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}" )
    public ResponseEntity<Anime> findById(@PathVariable Long id){
        return ResponseEntity.ok(animeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }

}
