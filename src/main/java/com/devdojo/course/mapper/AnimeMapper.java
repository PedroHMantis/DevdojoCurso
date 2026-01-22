package com.devdojo.course.mapper;

import com.devdojo.course.domain.Anime;
import com.devdojo.course.requests.AnimePostRequestBody;
import com.devdojo.course.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {

    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
