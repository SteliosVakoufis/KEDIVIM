using System.Collections.Generic;

namespace SinglyLinkedList
{
    internal class BootlegLinkedList<T>
    {
        public GenericNode<T>? Head { get; set; }

        public BootlegLinkedList()
        {
            Head = null;
        }

        public void InsertFirst(T t)
        {
            GenericNode<T> tmp = new();
            tmp.Value = t;
            tmp.Next = Head;
            Head = tmp;
        }

        public GenericNode<T>? RemoveFirst()
        {
            GenericNode<T> tmp = Head!;
            if (Head != null) Head = Head!.Next;
            return tmp;
        }

        public void InsertLast(T t)
        {
            if (Head == null)
            {
                InsertFirst(t);
                return;
            }

            GenericNode<T> tmp = new();

            GenericNode<T> last = Head;
            while (last.Next != null) { last = last.Next; }

            last.Next = tmp;
        }

        public GenericNode<T>? RemoveLast()
        {
            if (Head is null) return null;

            GenericNode<T> current = Head;
            while (current.Next!.Next != null) { current = current.Next; }

            GenericNode<T> temp = current.Next;
            current.Next = null;

            return temp;
        }

        public void Traverse()
        {
            if (Head is null) throw new Exception();

            GenericNode<T> current = Head;
            while (current is not null)
            {
                Console.WriteLine($"{current.Value} ");
                current = current.Next!;
            }
        }
    }
}
