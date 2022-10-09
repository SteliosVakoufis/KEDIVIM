using StudentsApp;

namespace StudentsAppEmpty
{
    public class Program
    {
        public static void Main(string[] args)
        {
            //var app = WebApplication.CreateBuilder(args).Build();

            //app.Run();

            Host.CreateDefaultBuilder(args)
                .ConfigureWebHostDefaults(webb => { webb.UseStartup<Startup>(); })
                .Build()
                .Run();

            // This message is shown after Kestrel has shutdown.
            Console.WriteLine("Thanks for using our insane application!");
        }
    }
}
