namespace PalindromeApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(IsPalindrome("madam"));
            Console.WriteLine(IsPalindrome(Console.ReadLine()));
            Console.WriteLine(IsPalindrome("madaM"));
        }

        private static bool IsPalindrome(string? s)
        {
            if (s == null) 
                return false;
            if (s.Length == 0)
                return false;

            int low = 0;
            int high = s.Length - 1;

            while (low != high)
            {
                if (s[low] != s[high])
                {
                    return false;
                }
                low++;
                high--;
            }

            return true;
        }

        private static string? GetUpperCase(string? s)
        {
            return s?.ToUpper();
        }
    }
}