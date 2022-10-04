using Chapter3_Exercise.dao;
using Chapter3_Exercise.dto;
using Chapter3_Exercise.service;

namespace Chapter3_Exercise
{
    internal class Program
    {
        private static IMovieLibraryService? service;

        static void Main(string[] args)
        {
            int choice = 0;

            service = new MovieLibraryServiceImpl(MovieLibraryDAOImpl.GetInstance());
            while (choice != 5)
            {
                PrintMenu();
                if (int.TryParse(Console.ReadLine(), out choice))
                {
                    switch (choice)
                    {
                        case 1:
                            try
                            {
                                Console.WriteLine("\nMovie Record Creation.");
                                if (service.CreateMovieRecord(ComposeMovieDTO()))
                                {
                                    Console.WriteLine("Movie was created succesfully!");
                                }
                            }
                            catch (Exception e)
                            {
                                Console.WriteLine(e.Message);
                            }
                            break;
                        case 2:
                            try
                            {
                                Console.WriteLine("\nMovie Record Update.");
                                if (service.UpdateMovieRecord(ComposeMovieDTO()))
                                {
                                    Console.WriteLine("Movie was updated succesfully!");
                                }
                            }
                            catch (Exception e)
                            {
                                Console.WriteLine(e.Message);
                            }
                            break;
                        case 3:
                            try
                            {
                                Console.WriteLine("\nMovie Record Deletion.");
                                if (service.DeleteMovieRecord(GetLong()))
                                {
                                    Console.WriteLine("Movie was deleted succesfully!");
                                }
                            }
                            catch (Exception e)
                            {
                                Console.WriteLine(e.Message);
                            }
                            break;
                        case 4:
                            try
                            {
                                Console.WriteLine("\nMovie Record Information.");
                                string result = service.GetMovieInformation(GetLong())!;
                                Console.WriteLine(result);
                            }
                            catch (Exception e)
                            {
                                Console.WriteLine(e.Message);
                            }
                            break;
                        case 5:
                            Console.WriteLine("Exiting application..");
                            break;
                        default:
                            Console.WriteLine("Insert a valid choice");
                            break;
                    }
                }
            }
        }

        //Helper Functions
        private static void PrintMenu()
        {
            Console.WriteLine(
                "-------------------------\n" +
                "1. Create Movie record\n" +
                "2. Update Movie record\n" +
                "3. Delete Movie record\n" +
                "4. Get Movie record information\n" +
                "5. Exit application\n" +
                "-------------------------");
        }

        private static long GetLong()
        {
            Console.WriteLine("--Insert a numerical ID--");
            return long.Parse(Console.ReadLine()!);
        }

        private static MovieDTO ComposeMovieDTO()
        {
            long Id = GetLong();

            Console.WriteLine("--Insert a string Title--");
            string? Title = Console.ReadLine()!;

            Console.WriteLine("--Insert Categories--");
            List<string>? Categories = ComposeStringList();

            Console.WriteLine("--Insert Directors--");
            List<string>? Directors = ComposeStringList();

            Console.WriteLine("--Insert Actors--");
            List<string>? Actors = ComposeStringList();

            return new MovieDTO()
            {
                Id = Id,
                Title = Title,
                Categories = Categories,
                Directors = Directors,
                Actors = Actors
            };
        }

        private static List<string>? ComposeStringList()
        {
            List<string>? result = new List<string>();
            string? input = "";

            Console.WriteLine("Type \"!n\" to finish insertion.");
            while (true)
            {
                input = Console.ReadLine()!;
                if (input == "!n") break;
                result.Add(input);

                Console.WriteLine("Current List: ");
                result.ForEach(str => Console.Write($"{str} "));
                Console.WriteLine();
            }

            return result;
        }
    }
}
