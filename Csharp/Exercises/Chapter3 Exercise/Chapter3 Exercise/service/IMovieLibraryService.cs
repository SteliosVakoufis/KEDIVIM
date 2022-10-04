using Chapter3_Exercise.dto;
using Chapter3_Exercise.model;

namespace Chapter3_Exercise.service
{
    internal interface IMovieLibraryService
    {
        bool CreateMovieRecord(MovieDTO movieDTO);

        bool UpdateMovieRecord(MovieDTO movieDTO);

        bool DeleteMovieRecord(long Id);

        string? GetMovieInformation(long Id);

        Dictionary<long, Movie> GetAllMovies();
    }
}
