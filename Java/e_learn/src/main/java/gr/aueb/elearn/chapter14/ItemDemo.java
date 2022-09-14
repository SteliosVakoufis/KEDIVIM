package gr.aueb.elearn.chapter14;

public class ItemDemo {
    public static void main(String[] args) {
        Item book = new Book();
        Item cd = new CompactDisk();

        deliver(book);
        deliver(cd);

    }

    public static void deliver(Item item) {
        try {
            System.out.println(item);
        } catch (Exception e) {
            throw new AssertionError(item);
        }
    }

}
