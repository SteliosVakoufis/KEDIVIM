namespace TypecastDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int myInt = 10;
            long liveTheQueen = 1_234_567_891_234L;
            float myFloat = 10.55F;
            double myDouble = 10D;
            decimal myDecimal = 1200.767M;

            Console.WriteLine($"{myInt}\n{liveTheQueen}\n{myFloat}\n{myDouble:2D}\n{myDecimal}");
        }
    }
}