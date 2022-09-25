using System.Numerics;

namespace PowPowApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            if (int.TryParse(Console.ReadLine(), out int num) && 
                int.TryParse(Console.ReadLine(), out int pow))
            {
                BigInteger result = 1;
                while (pow != 0)
                {
                    result *= num;
                    pow--;
                }
                Console.WriteLine($"Result is {result}");
            }
        }
    }
}