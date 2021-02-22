package model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article{
	private String date;
	private String layout;
	private List<String> categories;
	private String title;
	private String lang;
	private String url;
	private String content;
	private List<Object> tags;
}