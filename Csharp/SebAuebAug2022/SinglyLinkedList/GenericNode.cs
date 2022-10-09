namespace SinglyLinkedList
{
    internal class GenericNode<T>
    {
        public T? Value { get; set; }
        public GenericNode<T>? Next { get; set; }
    }
}
