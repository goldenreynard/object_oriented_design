public class Student {
    String Id;
    String name;
    Integer marks;
    char section;
    boolean isActive;
    void pause() {
        this.isActive = false;
    }
    Student(String Id, String name){
        this.Id = Id;
        this.name = name;
    }

    Student(){

    }
}

