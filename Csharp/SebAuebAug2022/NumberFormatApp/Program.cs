using System.Globalization;

namespace NumberFormatApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            long num = 1234L;
            double d = 1234.56780;

            DateTime dt = DateTime.Now;
            Thread.CurrentThread.CurrentUICulture = CultureInfo.GetCultureInfo("en-US");

            Console.WriteLine($"{dt:D}");
            Console.WriteLine($"{num:D6}");
            Console.WriteLine($"{d:C2}");
            Console.WriteLine($"{d:N2}");
            Console.WriteLine($"{3.451:P}");
            Console.WriteLine($"{254:X}");

        }
    }
}