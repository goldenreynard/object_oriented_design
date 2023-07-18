public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome!");
        Student kartik = new Student();
        kartik.name = "Kartik";
        kartik.Id = "A32";
        kartik.marks = 64;
        kartik.section = 'A';
        kartik.isActive = true;

        kartik.pause();
        System.out.println("Done");
    }
}