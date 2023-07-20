package Inheritence;

public class Main {
    public static void main(String[] args) {
        Admin kartik = new Admin();
        kartik.setId(32);
        kartik.setEmail("abc@dmail.com");
        kartik.setPublish(true);

        ContentWriter aman = new ContentWriter();
        aman.setComplete(true);
        aman.setId(21);
    }
}
