package de.jkueck;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordpressCreatePostDto {

    private String title;

    private String alarmTimestamp;

    private String keyword;

    private String location;

    private String text;

    private LocalDateTime plannedReleaseAt;

    private WordpressPostImage wordpressPostImage;

    private List<WordpressCategoryDto> categories;

    private List<WordpressTagDto> tags;

    private long operationId;

}
