namespace PointDAOServiceApp.Model
{
    internal class Point : IEquatable<Point>, IComparable<Point>
    {
        public int X { get; set; }

        public int CompareTo(Point? other)
            => this.X - other!.X;

        public bool Equals(Point? other)
            => !ReferenceEquals(null, other) &&
            this.CompareTo(other) == 0;

        public override bool Equals(object? obj)
            => obj != null &&
            obj.GetType() == this.GetType() &&
            this.CompareTo((Point)obj) == 0;

        public override int GetHashCode()
            => X;

        public override string? ToString()
            => $"X ({this.X})";

        public static bool operator >(Point op1, Point op2)
            => op1 is not null && op2 is not null && op1.CompareTo(op2) > 0;

        public static bool operator <(Point op1, Point op2)
            => op1 is not null && op2 is not null && op1.CompareTo(op2) < 0;

        public static bool operator >=(Point op1, Point op2)
            => op1 is not null && op2 is not null && op1.CompareTo(op2) >= 0;

        public static bool operator <=(Point op1, Point op2)
            => op1 is not null && op2 is not null && op1.CompareTo(op2) <= 0;

        public static bool operator ==(Point op1, Point op2)
            => op1 is not null && op2 is not null && op1.CompareTo(op2) == 0;

        public static bool operator !=(Point op1, Point op2)
            => op1 is not null && op2 is not null && op1.CompareTo(op2) != 0;
    }
}
