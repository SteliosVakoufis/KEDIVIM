namespace TestConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {

        }

        private static void CheckType<T>()
        {
            Console.WriteLine(typeof(T));
            if (typeof(T) == typeof(MyClass1))
            {
                Console.WriteLine("It's class1");
            }
            else if (typeof(T) == typeof(MyClass2))
            {
                Console.WriteLine("It's class2");
            }
            else
            {
                Console.WriteLine("Unkown Type");
            }
        }
    }
}