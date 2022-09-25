
namespace SwitchDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int option = 0;
            do
            {
                Menu();
                option = GetOption();

                if (option > 0 && option <6)
                    Console.WriteLine($"You have selected {option}");

            } while (option != 5);
        }

        private static void Menu()
        {
            Console.WriteLine("Select one of the following options..");
            Console.WriteLine("1. Insert");
            Console.WriteLine("2. Delete");
            Console.WriteLine("3. Update");
            Console.WriteLine("4. Search");
            Console.WriteLine("5. Exit");
        }

        private static int GetOption()
        {
            return int.Parse(Console.ReadLine()!);
        }
    }
}
