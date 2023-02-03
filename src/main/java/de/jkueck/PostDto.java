package de.jkueck;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private long id;

    private String alarmTimestamp;

    private String keyword;

    private String location;

    private LocalDateTime plannedReleaseAt;

    private String status;

    private String text;

    private String title;

}
