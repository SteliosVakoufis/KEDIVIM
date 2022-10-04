using Chapter3_Exercise.model;

namespace Chapter3_Exercise.dao
{
    internal class MovieLibraryDAOImpl : IMovieLibraryDAO
    {
        private static MovieLibraryDAOImpl? Instance;
        readonly private Dictionary<long, Movie> Movies;

        private MovieLibraryDAOImpl()
        {
            Console.WriteLine("DAO Instance created.");
            Movies = new Dictionary<long, Movie>();
        }

        public static MovieLibraryDAOImpl GetInstance() =>
            Instance is not null ? Instance : Instance = new MovieLibraryDAOImpl();

        public bool CreateMovieRecord(Movie movie)
        {
            if (!Movies.ContainsKey(movie.Id))
            {
                Movies.Add(movie.Id, movie);
                return true;
            }

            return false;
        }

        public bool DeleteMovieRecord(long Id)
        {
            if (Movies.ContainsKey(Id))
            {
                Movies.Remove(Id);
                return true;
            }

            return false;
        }

        public bool MovieExists(long Id) => Movies.ContainsKey(Id);

        public Dictionary<long, Movie> GetAllMovies() => new Dictionary<long, Movie>(Movies);

        public string? GetMovieInformation(long Id)
        {
            if (Movies.TryGetValue(Id, out Movie? result))
            {
                return result.ToString();
            }

            return null;
        }

        public bool UpdateMovieRecord(Movie movie)
        {
            if (Movies.ContainsKey(movie.Id))
            {
                Movies.Add(movie.Id, movie);
                return true;
            }

            return false;
        }
    }
}
