package Overiding;

public class B extends A{
    @Override
    void doSomething() {
        super.doSomething();
        System.out.println("Hello from B");
    }
}
