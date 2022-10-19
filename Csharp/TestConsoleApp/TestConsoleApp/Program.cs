namespace TestConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CheckType<MyClass1>();
        }

        private static void CheckType<T>()
        {
            Console.WriteLine(typeof(T));
            if (typeof(T) is MyClass1)
            {
                Console.WriteLine("It's class1");
            }
            else if (typeof(T) is MyClass2)
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