namespace HelloWorld
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string? myStr = "World";
            myStr = null;
            Console.WriteLine("Hello {0}!" , myStr);
        }
    }
}
