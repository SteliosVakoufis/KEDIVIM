namespace StringsDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string s1;

            string? s2;
            string s3 = "AUEB";
            string s4 = "AUEB";
            string s5 = new string("AUEB");
            string s6 = string.Intern("AUEB");
            string s7 = new("AUEB");

            Console.WriteLine($"{s3} == {s4} : {s3 == s5}");

        }
    }
}
