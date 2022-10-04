namespace Chapter3_Exercise.service.exceptions
{
    internal class MovieNotFoundException : Exception
    {
        public MovieNotFoundException() : base("Movie not found!") { }
    }
}
