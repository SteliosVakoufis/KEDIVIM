namespace Chapter3_Exercise.service.exceptions
{
    internal class MovieAlreadyExistsException : Exception
    {
        public MovieAlreadyExistsException() : base("A Movie with this Id already exists!") { }
    }
}
