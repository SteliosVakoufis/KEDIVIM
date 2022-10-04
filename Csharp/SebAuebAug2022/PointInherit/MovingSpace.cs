namespace PointInherit
{
    internal class MovingSpace
    {
        private IMovable Movable;

        public MovingSpace(IMovable movable)
        {
            this.Movable = movable;
        }

        public void Move(int amount)
        {
            Movable.Move(amount);
        }
    }
}
