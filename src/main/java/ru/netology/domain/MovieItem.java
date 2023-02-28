package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieItem {
    private int movieId;
    private String movieName;
    private String movieImageUrl;
    private int genreId;
}
