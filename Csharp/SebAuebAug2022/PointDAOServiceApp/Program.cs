using PointDAOServiceApp.DAO;
using PointDAOServiceApp.DTO;
using PointDAOServiceApp.Service;

namespace PointDAOServiceApp
{
    internal class Program
    {
        private static IPointService service =
            new PointServiceImpl(new PointDAOServiceImpl());
        static void Main(string[] args)
        {
            //Insert stuff here haha
        }
    }
}
