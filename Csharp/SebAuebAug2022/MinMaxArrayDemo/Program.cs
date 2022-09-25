namespace MinMaxArrayDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] myArr = { 1, 2, 3, 100, 20, 0, 2991, 000291, 900000, 91, 2, 3 };

            GetMinMax(myArr, out int min, out int max);

            Console.WriteLine($"min: {min} max: {max}");
        }

        static void GetMinMax(int[] arr, out int min, out int max)
        {
            min = arr[0];
            max = arr[0];

            foreach (var num in arr)
            {
                if (num < min)
                {
                    min = num;
                }
                if (num > max)
                {
                    max = num;
                }
            }
        }
    }
}