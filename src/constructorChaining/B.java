package constructorChaining;

public class B extends A{
    private String b;

    B(){
        super(); // Declared in the first line if the child constructor
        System.out.println("Hello B");
    }
}
