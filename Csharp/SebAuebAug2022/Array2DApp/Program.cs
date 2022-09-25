namespace Array2DApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] myArr = new int[2, 3];

            int[][] jagged = new int[3][];


            for (int i = 0; i < myArr.GetLength(0); i++)
            {
                for (int j = 0; j < myArr.GetLength(1); j++)
                {
                    myArr[i, j] = (i + 1) * (j + 1);
                    Console.Write($"{myArr[i, j]} ");
                }
                Console.WriteLine();
            }
        }
    }
}