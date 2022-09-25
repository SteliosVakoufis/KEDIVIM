namespace Exercise2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            const int S_DAY = 86400, S_HOUR = 3600, S_MINUTE = 60;

            Console.WriteLine("Give me a number that will be represented as seconds.");
            if (int.TryParse(Console.ReadLine()!, out int num))
            {
                int days, hours, minutes, seconds;

                days = num / S_DAY;
                if (days >= 1)
                {
                    num -= days * S_DAY;
                }

                hours = num / S_HOUR;
                if (hours >= 1)
                {
                    num -= hours * S_HOUR;
                }

                minutes = num / S_MINUTE;
                if (minutes >= 1)
                {
                    num -=  minutes * S_MINUTE;
                }

                seconds = num;


                Console.WriteLine($"{days} : days\n{hours} : hours\n{minutes} : minutes\n{seconds} : seconds\n");
            } 
        }
    }
}