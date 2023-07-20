package AccessModifiers;

public class Student {
    // Never put your attributes in public domain always use getter & setter for that
    private String Id;
    private String name;
    private Integer marks;
    private char section;
    private boolean isActive;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    void pause() {
        this.isActive = false;
    }

    Student(String Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    Student() {}

    Student(Student other){ // Copy constructor
        Id = other.Id;
        name = other.name;
        marks = other.marks;
        section = other.section;
        isActive = other.isActive;

        System.out.println("Hello Student");
    }
}

