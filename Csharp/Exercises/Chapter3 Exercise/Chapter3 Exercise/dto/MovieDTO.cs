namespace Chapter3_Exercise.dto
{
    internal class MovieDTO
    {
        public long Id { get; set; }
        public string? Title { get; set; }
        public List<string>? Categories { get; set; }
        public List<string>? Directors { get; set; }
        public List<string>? Actors { get; set; }
        public override string? ToString() =>
            $"{Title}\n{Categories}\n{Directors}\n{Actors}";

    }
}
