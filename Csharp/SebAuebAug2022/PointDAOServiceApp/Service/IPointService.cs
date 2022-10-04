using PointDAOServiceApp.DTO;
using PointDAOServiceApp.Model;

namespace PointDAOServiceApp.Service
{
    internal interface IPointService
    {
        void InsertPoint(PointDTO? p);

        bool UpdatePoint(PointDTO? p, int x);

        Point? DeletePoint(PointDTO? p);

        Point? GetPointFromDB(PointDTO? p);

        List<Point> GetAllPoints();
    }
}
