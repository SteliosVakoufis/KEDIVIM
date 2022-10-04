using PointDAOServiceApp.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointDAOServiceApp.DAO
{
    internal class PointDAOServiceImpl : IPointDAO
    {
        private List<Point> points;
        public List<Point> Points { get { return new(points); } }

        public void Insert(Point p)
        {
            if (p is not null)
            {
                points.Add(p);
            }
        }

        public Point? Delete(Point p)
            => p is not null ? (points.Remove(p) ? p : null) : null;

        public PointDAOServiceImpl()
        {
            this.points = new List<Point>();
        }

        public List<Point> GetAllPoints()
            => points;

        public Point? GetPoint(Point p)
            => p is not null ? (points.Contains(p) ? points[points.IndexOf(p)] : null) : null;

        public bool Update(Point p, int x)
        {
            if (p is null) return false;

            int positionToUpdate = points.IndexOf(p);

            if (positionToUpdate < 0) return false;

            points[positionToUpdate].X = x;

            return true;
        }
    }
}
