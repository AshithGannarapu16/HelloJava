package Polymorphism.Overriding;



public class Client {
   public static void main(String[] args) {
      Instructor instructor = new Instructor();
       System.out.println(instructor.getRole());

       User user=new User();
       System.out.println(user.getRole());

       Mentor mentor=new Mentor();
       System.out.println(mentor.getRole());



   }
}
