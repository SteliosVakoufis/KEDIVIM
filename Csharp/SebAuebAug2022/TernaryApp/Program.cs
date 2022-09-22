namespace TernaryApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insert a number now!");
            int inputNumber = int.Parse(Console.ReadLine()!);

            Console.WriteLine($"Absolute of inputNumber is {Math.Abs(inputNumber)}");
        }
    }
}
