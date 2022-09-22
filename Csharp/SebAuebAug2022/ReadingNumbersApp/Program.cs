namespace ReadingNumbersApp
{
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Please insert two numbers..");

            int num1 = int.Parse(Console.ReadLine()!);
            int num2 = int.Parse(Console.ReadLine()!);
            int result = num1 + num2;

            Console.WriteLine($"{num1} + {num2} = {result}");

        }
    }
}
