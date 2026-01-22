package com.devdojo.course.service;

import com.devdojo.course.domain.Anime;
import com.devdojo.course.mapper.AnimeMapper;
import com.devdojo.course.repository.AnimeRepository;
import com.devdojo.course.requests.AnimePostRequestBody;
import com.devdojo.course.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;


    public List<Anime> listAll(){
        return animeRepository.findAll();
    }

    public Anime findByIdOrThrowBadRequestException(Long id){
        return animeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    public Anime save(AnimePostRequestBody animePostRequestBody) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));

    }

    public void deleteById(Long id) {
      animeRepository.deleteById(id);

    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
        Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
        Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
        anime.setId(savedAnime.getId());

        animeRepository.save(anime);
    }
}
