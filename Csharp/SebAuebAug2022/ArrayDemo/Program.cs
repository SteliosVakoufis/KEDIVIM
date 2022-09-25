namespace ArrayDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int?[] myArr1 = { 1, 2, 3, 4, 5 };
            int?[] myArr2 = new int?[10];


            foreach (var num in myArr1)
            {
                Console.Write(num + " ");
            }
            Console.WriteLine();

            for (int i = 0; i < myArr2.Length; i++)
            {
                myArr2[i] = i + 1;
            }

            foreach (var num in myArr2)
            {
                Console.Write(num + " ");
            }
            Console.WriteLine();

        }
    }
}