package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Student aatma = new Student();
        aatma.setId("A43");
        aatma.setActive(true);

        Student vishwa = new Student(aatma);
    }
}
