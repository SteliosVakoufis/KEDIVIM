package gr.aueb.elearn.chapter17.doublylinkedlist;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        this.head = this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertFront(T val) {
        Node<T> temp = new Node<>();
        temp.setValue(val);
        // temp.setPrev(null);
        temp.setNext(this.head);

        if (this.head != null) {
            temp.getNext().setPrev(temp);
        } else {
            this.tail = temp;
        }

        this.head = temp;
    }

    public void insertEnd(T val) {
        Node<T> temp = new Node<>();
        temp.setValue(val);
        // temp.setNext(null);
        temp.setPrev(this.tail);

        if (this.isEmpty()) {
            this.head = temp;
        } else {
            temp.getPrev().setNext(temp);
        }

        this.head = temp;
    }

    public void deleteFront() {
        if (this.isEmpty())
            return;

        if (head.getNext() == null) {
            this.head = this.tail = null;
        } else {
            this.head = head.getNext();
            head.setPrev(null);
        }
    }

    public void deleteEnd() {
        if (this.isEmpty())
            return;

        if (head.getNext() == null) {
            this.head = this.tail = null;
        } else {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
        }
    }

    public Node<T> get(T t) {
        for (Node<T> n = this.head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) {
                return n;
            }
        }

        return null;
    }

    public void traverse() {
        for (Node<T> n = this.head; n != null; n = n.getNext()) {
            System.out.println(n);
        }
    }

    public int getLength() {
        Node<T> current = head;
        int result = 0;

        while (current.getNext() != null) {
            result++;
            current = current.getNext();
        }

        return result;
    }
}
