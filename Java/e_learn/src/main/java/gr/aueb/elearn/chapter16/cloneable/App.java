package gr.aueb.elearn.chapter16.cloneable;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException{
        City athens = new City("Athens 1");
        City clonedAthens = athens.clone();

        clonedAthens.setDescription("Athens 2");

        System.out.println(athens);
        System.out.println(clonedAthens);

        Trainee t1 = new Trainee("Jesus", new City("Athens"));
        Trainee t2 = new Trainee("Christ", new City("Kalamata"));
        Trainee t3 = t1.clone();

        t3.setName("Jackall");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
