using PointDAOServiceApp.DAO;
using PointDAOServiceApp.DTO;
using PointDAOServiceApp.Model;

namespace PointDAOServiceApp.Service
{
    internal class PointServiceImpl : IPointService
    {
        private readonly IPointDAO dao;

        public PointServiceImpl(IPointDAO dao)
        {
            this.dao = dao;
        }

        public void InsertPoint(PointDTO? p)
        {
            if (p is null) return;
            dao.Insert(extractDTO(p)!);
        }

        public Point? DeletePoint(PointDTO? p)
        {
            if (p is null) return null;
            return dao.Delete(extractDTO(p)!);
        }

        public bool UpdatePoint(PointDTO? p, int x)
        {
            if (p is null) return false;
            return dao.Update(extractDTO(p)!, x);
        }

        public List<Point> GetAllPoints()
        {
            return dao.GetAllPoints();
        }

        public Point? GetPointFromDB(PointDTO? p)
        {
            if (p is null) return null;
            return dao.GetPoint(extractDTO(p)!);
        }

        // Helper Functions
        private Point? extractDTO(PointDTO? pointDTO)
        {
            if (pointDTO is null) return null;
            return new Point()
            {
                X = pointDTO.X
            };
        }
    }
}
