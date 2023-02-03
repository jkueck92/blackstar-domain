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
public class NewOperationRequest {

    private String timestamp;

    private String keyword;

    private String keywordText;

    private String location;

}