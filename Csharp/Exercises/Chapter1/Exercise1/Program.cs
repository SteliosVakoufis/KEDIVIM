namespace Exercise1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const double DOLLAR_VALUE = 1.16;

            Console.WriteLine("Insert an amount of Euro to convert them into Dollars");
            if (double.TryParse(Console.ReadLine(), out double userInput))
            {
                Console.WriteLine($"{userInput} euro are {(userInput * DOLLAR_VALUE)} dollars");
            }
        }
    }
}