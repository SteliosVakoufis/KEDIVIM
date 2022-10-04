namespace PointInherit
{
    internal class Point : IMovable
    {
        public int X { get; set; }
        public override string? ToString() => $"X: ({this.X})";

        public static Point GetPoint() => new();

        public void Move(int amount) => X += amount;
    }
}
