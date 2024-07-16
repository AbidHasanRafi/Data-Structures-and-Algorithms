class Dog {
    String name;
    int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Pet {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
    }
}