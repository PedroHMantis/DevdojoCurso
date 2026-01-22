package com.devdojo.course.requests;

import com.devdojo.course.domain.Anime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AnimePutRequestBody {
    private Long  id;
    private String name;

}
