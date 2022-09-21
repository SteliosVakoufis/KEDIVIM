package gr.aueb.elearn.chapter17;

import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class MainApp {
    public static void main(String[] args) {
        GenericNode<Integer> intNode = new GenericNode<>();
        var intNode2 = new GenericNode<Integer>();

        System.out.println(intNode.getItem());
        System.out.println(intNode2.getItem());

        var myArrayList = new ArrayList<Integer>();
        myArrayList.add(10);
        myArrayList.add(100);
        myArrayList.add(1000);
        myArrayList.add(10000);

        printArrayList(myArrayList);


        Stack<Integer> myStack = new Stack<>();
        
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("POP: " + myStack.pop());

        myStack.forEach(System.out::println);
    }

    public static <T> void printArrayList(ArrayList<T> arr) {
        for (T t : arr) {
            System.out.printf("%d ", t);
        }
        System.out.println();
    }

    public static void print(GenericNode<? extends Number> node) {
        System.out.println(node.getItem());
    }
    
}
