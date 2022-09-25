using System.Numerics;

namespace FactoApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num = 10;
            Console.WriteLine($"Factorial of {num} is {Factorial(num)}");
        }

        private static BigInteger Factorial(int num)
        {
            return num != 1 ? Factorial(num - 1) * num : num;
        }
    }
}
