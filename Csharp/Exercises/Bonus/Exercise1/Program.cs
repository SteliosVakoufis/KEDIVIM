using System.Text;

namespace Exercise1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string myStr = "  Hello      World!";
            Console.WriteLine(myStr);

            StringBuilder sb = new StringBuilder();

            sb.Append(myStr[0]);
            for (int i = 1; i < myStr.Length; i++)
            {
                if (!(myStr[i - 1] == 32 && myStr[i] == 32))
                {
                    sb.Append(myStr[i]);
                }
            }

            Console.WriteLine(sb);
        }
    }
}
