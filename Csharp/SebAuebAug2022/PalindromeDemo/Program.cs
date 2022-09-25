namespace PalindromeDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] myArr1 = { 1, 2, 3, 2, 1 };
            int[] myArr2 = { 1, 2, 3, 2, 5 };

            Console.WriteLine(IsPalindrome(myArr1));
            Console.WriteLine(IsPalindrome(myArr2));
        }

        private static bool IsPalindrome(int[] arr)
        {
            if (arr.Length == 0)
                return false;

            int low = 0;
            int high = arr.Length - 1;

            while (low != high)
            {
                if (arr[low] != arr[high])
                {
                    return false;
                }
                low++;
                high--;
            }

            return true;
        }
    }
}
