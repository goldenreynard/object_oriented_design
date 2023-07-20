package polymorphism;

public class Student extends User{
    String batch;

    void changeBatch(String newBatch){
        this.batch = newBatch;
    }
}
