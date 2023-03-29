package ru.netology;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private Movie[] moviesReverse = new Movie[0];
    private int countMovies = 10;//счетчик кол-ва выводимых фильмов для метода findLast

    public MovieManager() {
    }

    public MovieManager(int countMovies) {
        this.countMovies = countMovies;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public Movie[] getMoviesReverse() {
        return moviesReverse;
    }

    public void setMoviesReverse(Movie[] moviesReverse) {
        this.moviesReverse = moviesReverse;
    }

    public int getCountMovies() {
        return countMovies;
    }

    public void setCountMovies(int countMovies) {
        this.countMovies = countMovies;
    }

    //добавление фильма в конец массива
    public void add(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }

    //вывод всех фильмов в порядке добавления
    public void findAll() {
        getMovies();
    }

    //вывод n фильмов в обратном порядке (по умолчанию n = 10)
    public void findLast() {
        if (countMovies > movies.length) { //проверка, что n не больше нашего массива с фильмами
            countMovies = movies.length;
        }
        Movie[] tmp = new Movie[countMovies];
        for (int i = 0, j = movies.length - 1; i < countMovies; i++, j--) {
            tmp[i] = movies[j];
        }
        moviesReverse = tmp;
    }
}