using Chapter3_Exercise.dao;
using Chapter3_Exercise.dto;
using Chapter3_Exercise.model;
using Chapter3_Exercise.service.exceptions;

namespace Chapter3_Exercise.service
{
    internal class MovieLibraryServiceImpl : IMovieLibraryService
    {
        readonly IMovieLibraryDAO Dao;

        public MovieLibraryServiceImpl(MovieLibraryDAOImpl dao)
        {
            Console.WriteLine("Service initialized.");
            Dao = dao;
        }

        public bool CreateMovieRecord(MovieDTO movieDTO)
        {
            try
            {
                if (!Dao.MovieExists(movieDTO.Id))
                {
                    Dao.CreateMovieRecord(ConvertMovieDTOtoMovie(movieDTO));
                    return true;
                }
                else
                {
                    throw new MovieAlreadyExistsException();
                }
            }
            catch (Exception)
            {
                throw;
            }
        }

        public bool DeleteMovieRecord(long Id)
        {
            try
            {
                if (Dao.MovieExists(Id))
                {
                    Dao.DeleteMovieRecord(Id);
                    return true;
                }
                else
                {
                    throw new MovieNotFoundException();
                }
            }
            catch (Exception)
            {
                throw;
            }
        }

        public Dictionary<long, Movie> GetAllMovies()
        {
            return Dao.GetAllMovies();
        }

        public string? GetMovieInformation(long Id)
        {
            try
            {
                if (Dao.MovieExists(Id))
                {
                    return Dao.GetMovieInformation(Id);
                }
                else
                {
                    throw new MovieNotFoundException();
                }
            }
            catch (Exception)
            {
                throw;
            }
        }

        public bool UpdateMovieRecord(MovieDTO movieDTO)
        {
            try
            {
                if (Dao.MovieExists(movieDTO.Id))
                {
                    Dao.UpdateMovieRecord(ConvertMovieDTOtoMovie(movieDTO));
                    return true;
                }
                else
                {
                    throw new MovieNotFoundException();
                }
            }
            catch (Exception)
            {
                throw;
            }
        }

        //Helper Functions
        private static Movie ConvertMovieDTOtoMovie(MovieDTO movieDTO) => new()
        {
            Id = movieDTO.Id,
            Title = movieDTO.Title,
            Categories = movieDTO.Categories,
            Directors = movieDTO.Directors,
            Actors = movieDTO.Actors
        };

    }
}
