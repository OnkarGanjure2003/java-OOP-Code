package Lecture16OOP;
public class Polymorphism {
    public static class Dog {
        void speak() {
            System.out.println("Bho-Bho");
        }
    }

    public static class Cat {
        void speak() {
            System.out.println("Mew-Mew");
        }
    }

    public static class Human {
        void speak() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat babu = new Cat();
        Human rahul = new Human();
        tommy.speak();
        babu.speak();
        rahul.speak();
    }
}
