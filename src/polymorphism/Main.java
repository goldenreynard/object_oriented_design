package polymorphism;

import java.util.List;

public class Main {

    public static void changeEmailOfAllUsers(List<User> users) {
        for (User user : users) {
            user.changeEmail("abc.def@email.com");
            if (user instanceof Student) {
                Student student = (Student) user;
                student.batch = "B32";
            }
        }
    }

    public static void main(String[] args) {
        User user = new User();
        User student = new Student();
        User mentor = new Mentor();
        User assistant = new Assistant();

        List<User> users = List.of(
                user,
                student,
                mentor,
                assistant,
                new Student(),
                new Mentor()
        );
        changeEmailOfAllUsers(users);
    }
}
