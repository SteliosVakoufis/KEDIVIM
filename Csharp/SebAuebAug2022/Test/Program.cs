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
            //int i = 1;
            //Console.WriteLine(i);
            //AddOne(i, out i);
            //Console.WriteLine(i);
        }

        private static void AddOne(int i, out int result)
        {
            result = i + 1;
        }

        private static bool Sum(int a, int b, out int result, out int c)
        {
            c = a;
            result = a + b;
            return true;
        }
    }
}