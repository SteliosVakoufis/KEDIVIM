namespace PointInherit
{
    internal sealed class Point3D : Point2D, IMovable
    {
        public int Z { get; set; }

        public override string? ToString() => $"{base.ToString} Z: {this.Z}";

        public Point3D() { }

        public static Point3D GetPoint3D() => new();

        public new void Move(int amount)
        {
            base.Move(amount);
            this.Z += amount;
        }
    }
}
