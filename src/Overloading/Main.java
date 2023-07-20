package Overloading;

public class Main {
    public static void main(String[] args) {
        B a = new B();
        a.printA();
        a.printA("Aatma"); // compile time polymorphism
    }
}
