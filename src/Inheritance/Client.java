package Inheritance;

public class Client {
    public static void main(String[] args) {
        User user=new User(1,"shiva");
        Student student=new Student();
        D d=new D();

        student.setId(1);
        student.setName("Shiva kumar");

        student.login();
        Instructor instructor=new Instructor();
        instructor.setId(1);
        instructor.setName("Murali");

        instructor.login();

        System.out.println();


    }
}
