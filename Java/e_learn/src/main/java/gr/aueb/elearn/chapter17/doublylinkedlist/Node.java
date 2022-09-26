package gr.aueb.elearn.chapter17.doublylinkedlist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Node <T> {
    private T value;
    private Node<T> next;
    private Node<T> prev;
    
    public Node(T value) {
        this.value = value;
    }
}
