namespace TryParseDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Insert two integer numbers now!");
            bool b1 = int.TryParse(Console.ReadLine()!, out int num1);

            if (b1)
            {
                Console.WriteLine("Succes!" + num1);
            }
            else
            {
                Console.WriteLine("Failure!");
            }
        }
    }
}