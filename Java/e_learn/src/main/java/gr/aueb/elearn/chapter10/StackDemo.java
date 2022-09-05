package gr.aueb.elearn.chapter10;

import java.util.ArrayList;

public class StackDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myStack = new ArrayList<>();

        push(myStack, 1203);
        push(myStack, 43);
        push(myStack, 323);
        push(myStack, 42);
        push(myStack, 1203);
        push(myStack, 552);
        push(myStack, 1223);

        prinStack(myStack);

        System.out.println(pop(myStack));
        System.out.println(pop(myStack));
        System.out.println(pop(myStack));

        prinStack(myStack);

    }

    private static Integer pop(ArrayList<Integer> list) {
        if (list.size() != 0) {
            return list.remove(list.size() - 1);
        }
        return null;
    }

    private static void push(ArrayList<Integer> list, Integer item) {
        list.add(item);
    }

    private static Integer peek(ArrayList<Integer> list) {
        if (list.size() != 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    private static void prinStack(ArrayList<Integer> list){
        list.forEach(val -> System.out.printf("%d ", val));
        System.out.println();
    }

}
