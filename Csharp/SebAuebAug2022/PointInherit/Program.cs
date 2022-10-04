namespace PointInherit
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var p1 = new Point();
            var p2 = Point.GetPoint();
            var p3 = new Point();
            Point p4 = new()
            {
                X = 5
            };

            Point p5 = new Point2D();
            Point p6 = new Point3D();

            p4.Move(5);
            p6.Move(5);

            DoMove(p6);
            DoMove(p4);
            DoMove(p2);

        }

        private static void DoMove(Point p)
        {
            p.Move(5);
        }
    }
}
