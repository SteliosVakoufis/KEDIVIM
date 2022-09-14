package gr.aueb.elearn.chapter14;

public class Main {
    public static void main(String[] args) {
        ISpeakable garfield = new Cat("Garfield", 100);
        ISpeakable blackDog = new Dog("Blackie", 2);

        SpeakingSchool school = new SpeakingSchool(garfield);

        System.out.println(garfield);
        System.out.println(blackDog);

        sayHello(garfield);
        sayHello(blackDog);
    }

    public static void sayHello(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
