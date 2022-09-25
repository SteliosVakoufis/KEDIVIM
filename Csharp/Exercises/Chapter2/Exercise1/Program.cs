namespace Exercise1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            BootlegStack myStack = new BootlegStack(50);

            Console.WriteLine(myStack.IsFull());
            Console.WriteLine(myStack.IsEmpty());

            Console.WriteLine(myStack.Pop());

            myStack.Push(000);
            myStack.Push(111);
            myStack.Push(222);
            myStack.Push(333);

            myStack.PrintStack();

            Console.WriteLine(myStack.Pop());

            myStack.Push(222);
            myStack.Push(222);

            myStack.PrintStack();

            Console.WriteLine(myStack.IsFull());
            Console.WriteLine(myStack.IsEmpty());


            Console.WriteLine(myStack.Pop());
            Console.WriteLine(myStack.Pop());
            Console.WriteLine(myStack.Pop());
            Console.WriteLine(myStack.Pop());
            Console.WriteLine(myStack.Pop());

            Console.WriteLine(myStack.IsFull());
            Console.WriteLine(myStack.IsEmpty());
        }
    }
}
