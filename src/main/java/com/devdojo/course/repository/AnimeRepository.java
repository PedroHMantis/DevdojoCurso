package com.devdojo.course.repository;

import com.devdojo.course.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
