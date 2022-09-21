package gr.aueb.elearn.chapter17;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Stack<T> {
    private final Deque<T> stack;

    public Stack() {
        stack = new ArrayDeque<>();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(T t) {
        if (t == null)
            return;
        stack.addLast(t);
    }

    public T pop() {
        if (this.isEmpty())
            return null;
        return stack.removeLast();
    }

    public void forEach(Consumer<T> action) {
        stack.forEach(action);
    }
}
