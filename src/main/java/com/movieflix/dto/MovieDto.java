package com.movieflix.dto;

import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
	
	private Integer movieId;
	
	@NotBlank(message = "Please provide movies title !!")
	private String title;
	
	@NotBlank(message = "Please provide movies director !!")
	private String director;
	
	@NotBlank(message = "Please provide movies studio !!")
	private String studio;
	
	private Set<String> movieCast;
	
	private Integer releaseYear;
	
	@NotBlank(message = "Please provide movies poster !!")
	private String poster; 
	
	
	@NotBlank(message = "Please provide movies poster url !!")
	private String posterUrl;

}
