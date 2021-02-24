package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    private String date;
    private String layout;
    private List<String> categories;
    private String title;
    private String lang;
    private String url;
    private String content;
    private List<Object> tags;
}
