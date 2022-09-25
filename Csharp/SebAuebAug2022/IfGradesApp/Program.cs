namespace IfGradesApp
{
    /// <summary>
    /// Something Something Something
    /// </summary>
    internal class Program
    {
        static void Main(string[] args)
        {
            if (int.TryParse(Console.ReadLine(), out int count))
            {
                int sum = 0;
                for (int i = 0; i < count; i++)
                {
                    int.TryParse(Console.ReadLine(), out int num);
                    sum += num;
                }
                int avg = sum / count;
                Console.WriteLine($"Average is: {avg}");

                if (avg >= 20)
                {
                    Console.WriteLine("You are a genius!");
                }
                if (avg >= 15)
                {
                    Console.WriteLine("You are average!");
                }
                if (avg >= 10)
                {
                    Console.WriteLine("You are ok!");
                }
                if (avg < 10)
                {
                    Console.WriteLine("You fail!");
                }
            }
        }
    }
}
