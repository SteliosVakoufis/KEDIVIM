namespace WhileDemo
{
    /// <summary>
    /// It does something, mkay?
    /// </summary>
    internal class Program
    {
        static void Main(string[] args)
        {
            if (int.TryParse(Console.ReadLine(), out int num))
            {
                int sumAdd = 0;
                int sumMult = 1;
                while(num != 0)
                {
                    sumAdd += num;
                    sumMult *= num;
                    num--;
                }
                Console.WriteLine($"addition {sumAdd} mult {sumMult}");
            }
        }
    }
}
