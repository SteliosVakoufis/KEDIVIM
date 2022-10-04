using Chapter3_Exercise.model;

namespace Chapter3_Exercise.dao
{
    internal interface IMovieLibraryDAO
    {
        bool CreateMovieRecord(Movie movie);

        bool UpdateMovieRecord(Movie movie);

        bool DeleteMovieRecord(long Id);

        bool MovieExists(long Id);

        string? GetMovieInformation(long Id);

        Dictionary<long, Movie> GetAllMovies();
    }
}
