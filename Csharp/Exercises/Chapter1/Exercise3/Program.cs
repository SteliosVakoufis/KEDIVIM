using System.Numerics;

namespace Exercise3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const int S_DAY = 86400, S_HOUR = 3600, S_MINUTE = 60;

            Console.WriteLine("Insert a sequence of numbers that will be represented as DD/HH/MM/SS");
            if (int.TryParse(Console.ReadLine()!, out int days) &&
                int.TryParse(Console.ReadLine()!, out int hours) &&
                int.TryParse(Console.ReadLine()!, out int minutes) &&
                int.TryParse(Console.ReadLine()!, out int seconds))
            {
                BigInteger result = (days * S_DAY) + (hours * S_HOUR) + (minutes * S_MINUTE) + seconds;

                Console.WriteLine($"What you inserted in seconds is:\n{result}");
            }
        }
    }
}