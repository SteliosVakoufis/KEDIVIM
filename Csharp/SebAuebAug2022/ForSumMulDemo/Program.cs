using System.Numerics;

namespace ForSumMulDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num;
            int sum = 0;
            BigInteger mul = 1;

            Console.WriteLine("Please insert an int");
            num = int.Parse(Console.ReadLine()!);

            for (int i = 1; i < num; i++)
            {
                sum += i;
                mul *= i;
            }

            Console.WriteLine(sum);
            Console.WriteLine(mul);
        }
    }
}