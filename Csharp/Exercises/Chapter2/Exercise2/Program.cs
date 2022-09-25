namespace Exercise2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BootlegQueue myQueue = new BootlegQueue(50);

            Console.WriteLine(myQueue.IsFull());
            Console.WriteLine(myQueue.IsEmpty());

            Console.WriteLine(myQueue.DeQueue());

            myQueue.EnQueue(000);
            myQueue.EnQueue(111);
            myQueue.EnQueue(222);
            myQueue.EnQueue(333);

            myQueue.PrintStack();

            Console.WriteLine(myQueue.DeQueue());

            myQueue.EnQueue(222);
            myQueue.EnQueue(222);

            myQueue.PrintStack();

            Console.WriteLine(myQueue.IsFull());
            Console.WriteLine(myQueue.IsEmpty());


            Console.WriteLine(myQueue.DeQueue());
            Console.WriteLine(myQueue.DeQueue());
            Console.WriteLine(myQueue.DeQueue());
            Console.WriteLine(myQueue.DeQueue());
            Console.WriteLine(myQueue.DeQueue());

            Console.WriteLine(myQueue.IsFull());
            Console.WriteLine(myQueue.IsEmpty());
        }
    }
}
