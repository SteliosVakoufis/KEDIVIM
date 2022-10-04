namespace Chapter3_Exercise.model
{
    internal class Movie
    {
        public long Id { get; set; }
        public string? Title { get; set; }
        public List<string>? Categories { get; set; }
        public List<string>? Directors { get; set; }
        public List<string>? Actors { get; set; }

        public override string? ToString() =>
            $"Title: {Title}\n" +
            $"Category: {string.Join(",", Categories!)}\n" +
            $"Directors: {string.Join(",", Directors!)}\n" +
            $"Actors: {string.Join(",", Actors!)}";
    }
}
