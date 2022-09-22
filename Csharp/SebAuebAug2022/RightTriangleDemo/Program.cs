namespace RightTriangleDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double a = 0D;
            double b = 0D;
            double c = 0D;

            const double EPSILON = 0.000005;

            bool isAlright = false;

            Console.WriteLine("Please insert dimensions.. (a,b,c)");
            a = double.Parse(Console.ReadLine()!);
            b = double.Parse(Console.ReadLine()!);
            c = double.Parse(Console.ReadLine()!);

            //isAlright = Math.Abs(a * a - b * b - c * c) < EPSILON;
            isAlright = double.Equals(a * a - b * b, c * c);

            Console.WriteLine(isAlright);

        }
    }
}