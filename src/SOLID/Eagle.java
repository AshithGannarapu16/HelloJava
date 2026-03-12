package SOLID;

public class Eagle extends Bird implements  Flyable {

    @Override
    public void fly() {
        System.out.println("Flying hig!!");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is producing sound");
    }


}
