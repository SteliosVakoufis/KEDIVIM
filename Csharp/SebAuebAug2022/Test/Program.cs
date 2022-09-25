namespace Test
{
    internal class Program
    {
        static void Main(string[] args)
        {
            bool ok = Sum(10, 5, out int res, out int c);
            Console.WriteLine(ok);
            Console.WriteLine(res);
            Console.WriteLine(c);
        }

        private static bool Sum(int a, int b, out int result, out int c)
        {
            c = a;
            result = a + b;
            return true;
        }
    }
}