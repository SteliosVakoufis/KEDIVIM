using PointDAOServiceApp.Model;

namespace PointDAOServiceApp.DAO
{
    internal interface IPointDAO
    {
        void Insert(Point p);

        bool Update(Point p, int x);

        Point? Delete(Point p);

        Point? GetPoint(Point p);

        List<Point> GetAllPoints();
    }
}
