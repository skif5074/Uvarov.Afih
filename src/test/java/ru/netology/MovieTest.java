package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    Movie movieOne = new Movie(1, "One");
    Movie movieTwo = new Movie(2, "Two");
    Movie movieThree = new Movie(3, "Three");
    Movie movieFour = new Movie(4, "Four");
    Movie movieFive = new Movie(5, "Five");
    Movie movieSix = new Movie(6, "Six");
    Movie movieSeven = new Movie(7, "Seven");
    Movie movieEight = new Movie(8, "Eight");
    Movie movieNine = new Movie(9, "Nine");
    Movie movieTen = new Movie(10, "Ten");
    Movie movieEleven = new Movie(11, "Eleven");
    Movie movieTwelve = new Movie(12, "Twelve");
    Movie movieThirteen = new Movie(13, "Thirteen");
    Movie movieFourteen = new Movie(14, "Fourteen");
    Movie movieFifteen = new Movie(15, "Fifteen");
    Movie movieSixteen = new Movie(16, "Sixteen");

    Movie[] moviesTestList0 = new Movie[0];
    Movie[] moviesTestList1 = {
            movieOne};
    Movie[] moviesTestList5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    Movie[] moviesTestList15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    Movie[] moviesExpectedAdd0 = {
            movieOne};
    Movie[] moviesExpectedAdd1 = {
            movieOne,
            movieTwo};
    Movie[] moviesExpectedAdd5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix};
    Movie[] moviesExpectedAdd15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen,
            movieSixteen};

    Movie[] moviesExpectedFindAll0 = new Movie[0];
    Movie[] moviesExpectedFindAll1 = {
            movieOne};
    Movie[] moviesExpectedFindAll5 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive};
    Movie[] moviesExpectedFindAll15 = {
            movieOne,
            movieTwo,
            movieThree,
            movieFour,
            movieFive,
            movieSix,
            movieSeven,
            movieEight,
            movieNine,
            movieTen,
            movieEleven,
            movieTwelve,
            movieThirteen,
            movieFourteen,
            movieFifteen};

    Movie[] moviesExpectedFindLast0DefaultCount = new Movie[0];
    Movie[] moviesExpectedFindLast1DefaultCount = {
            movieOne};
    Movie[] moviesExpectedFindLast5DefaultCount = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    Movie[] moviesExpectedFindLast15DefaultCount = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine,
            movieEight,
            movieSeven,
            movieSix};

    Movie[] moviesExpectedFindLast15Count0 = new Movie[0];
    Movie[] moviesExpectedFindLast5Count7 = {
            movieFive,
            movieFour,
            movieThree,
            movieTwo,
            movieOne};
    Movie[] moviesExpectedFindLast15Count7 = {
            movieFifteen,
            movieFourteen,
            movieThirteen,
            movieTwelve,
            movieEleven,
            movieTen,
            movieNine};

    MovieManager manager = new MovieManager();
    MovieManager managerCountNull = new MovieManager(0);
    MovieManager managerCountSeven = new MovieManager(7);

    @Test
    void shouldAddNullMovies() {
        Movie[] expected = moviesExpectedAdd0;
        manager.setMovies(moviesTestList0);
        manager.add(movieOne);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddOneMovies() {
        Movie[] expected = moviesExpectedAdd1;
        manager.setMovies(moviesTestList1);
        manager.add(movieTwo);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFiveMovies() {
        Movie[] expected = moviesExpectedAdd5;
        manager.setMovies(moviesTestList5);
        manager.add(movieSix);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFifteenMovies() {
        Movie[] expected = moviesExpectedAdd15;
        manager.setMovies(moviesTestList15);
        manager.add(movieSixteen);
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllNullMovies() {
        Movie[] expected = moviesExpectedFindAll0;
        manager.setMovies(moviesTestList0);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllOneMovies() {
        Movie[] expected = moviesExpectedFindAll1;
        manager.setMovies(moviesTestList1);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFiveMovies() {
        Movie[] expected = moviesExpectedFindAll5;
        manager.setMovies(moviesTestList5);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFifteenMovies() {
        Movie[] expected = moviesExpectedFindAll15;
        manager.setMovies(moviesTestList15);
        manager.findAll();
        assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindLastNullMoviesDefaultCount() {
        Movie[] expected = moviesExpectedFindLast0DefaultCount;
        manager.setMovies(moviesTestList0);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastOneMoviesDefaultCount() {
        Movie[] expected = moviesExpectedFindLast1DefaultCount;
        manager.setMovies(moviesTestList1);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesDefaultCount() {
        Movie[] expected = moviesExpectedFindLast5DefaultCount;
        manager.setMovies(moviesTestList5);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesDefaultCount() {
        Movie[] expected = moviesExpectedFindLast15DefaultCount;
        manager.setMovies(moviesTestList15);
        manager.findLast();
        assertArrayEquals(expected, manager.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountNull() {
        Movie[] expected = moviesExpectedFindLast15Count0;
        managerCountNull.setMovies(moviesTestList15);
        managerCountNull.findLast();
        assertArrayEquals(expected, managerCountNull.getMoviesReverse());
    }

    @Test
    void shouldFindLastFiveMoviesCountSeven() {
        Movie[] expected = moviesExpectedFindLast5Count7;
        managerCountSeven.setMovies(moviesTestList5);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }

    @Test
    void shouldFindLastFifteenMoviesCountSeven() {
        Movie[] expected = moviesExpectedFindLast15Count7;
        managerCountSeven.setMovies(moviesTestList15);
        managerCountSeven.findLast();
        assertArrayEquals(expected, managerCountSeven.getMoviesReverse());
    }
}
