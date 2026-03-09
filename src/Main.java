public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int x=10;
        int y=20;

        System.out.println(x);
        Student student=new Student();
//        student.age=10;
//        student.name="Hello World!";
        student.name="Ashith";
        student.age=24;
        student.id=6;
        student.gradYear=2023;

        student.printDetails();


        Student student1=new Student();

        student1.name="Amulya";
        student1.id=3;
        student1.gradYear=2034;
        student1.age=13;

        student1.printDetails();


        Student me =new Student();
        me.name="david";
        me.id=4;
        me.gradYear=1996;
        me.age=53;

        me.printDetails();

        Student student2=student;
        System.out.println(student2.name);

        student2.name="Sukdev";
        System.out.println("Student2 name is "+student2.name);




    }

}
