namespace MethodsApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            int a = 10, b = 20;
            Console.WriteLine($"{a} | {b}");
            SwapInts(a, b, out a, out b);
            Console.WriteLine($"{a} | {b}\n");

            String aS = "One", bS = "two";
            Console.WriteLine($"{aS} | {bS}");
            SwapStrings(aS, bS, out aS, out bS);
            Console.WriteLine($"{aS} | {bS}\n");

            Console.WriteLine($"{AddAll(10, 20, 30, 40, 50)}\n");
        }

        private static int AddAll(params int[] arr)
        {
            int result = 0;
            foreach(int val in arr)
            {
                result += val;
            }
            return result;
        }

        private static void SwapInts(int i, int j, out int num1, out int num2)
        {
            int temp = i;
            num1 = j;
            num2 = temp;
        }

        private static void SwapStrings(String s1, String s2, out String str1, out String str2)
        {
            String temp = s1;
            str1 = s2;
            str2 = temp;
        }
    }
}
