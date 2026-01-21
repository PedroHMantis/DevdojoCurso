package com.devdojo.course.repository;

import com.devdojo.course.domain.Anime;

import java.util.List;


public interface AnimeRepository {

    public List<Anime> listAll();
}
