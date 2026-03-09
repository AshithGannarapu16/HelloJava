//package CopyConstructor;
//
//public class Student {
//    private  int id;
//    private String name;
//    private int age;
//    private  double psp;
//    private double attendance;
//
//    private  Batch batch;
//    private Exam enrollment;
//
//
//
//
//    public Student(int id, String name, int age, double psp, double attendance, String batch, Exam enrollment) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        psp=100.0;
//        attendance=100;
//        this.batch=new Batch(new Batch);
//        this.enrollment=enrollment;
//
//    }
//
//    public Student(Student other) {
//        this.id = other.id;
//        this.name = other.name;
//        this.age = other.age;
//        this.psp = other.psp;
//        this.attendance = other.attendance;
//
//        this.batch = other.batch;
//        this.enrollment = other.enrollment;
//
//
//
//    }
//
//    //assumption :you can multiple constructor
//
//    public int getId() {
//        return id;
//    }
//
//    public void setBatch(Batch batch) {
//        this.batch = batch;
//    }
//
//
//
//}
//
//


