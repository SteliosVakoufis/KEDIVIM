namespace PointInherit
{
    internal class Point2D : Point, IMovable
    {

        public int Y { get; set; }

        public override string? ToString() => $"{base.ToString} Y: {this.Y}";

        public Point2D() : base() { }

        public static Point2D GetPoint2D() => new Point2D();

        public new void Move(int amount)
        {
            base.Move(amount);
            this.Y += amount;
        }
    }
}
