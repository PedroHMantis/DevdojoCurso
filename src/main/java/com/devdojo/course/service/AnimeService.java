package com.devdojo.course.service;

import com.devdojo.course.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    public List<Anime> listAll(){
        return List.of(new Anime(1L,"Naruto"), new Anime(2L,"One Piece"), new Anime(3L,"Bleach"),
                new Anime(4L,"Shoujo Ramune"), new Anime(5L,"Naruto Shippuden gay"), new Anime(3L,"DBZ"));
    }
}
