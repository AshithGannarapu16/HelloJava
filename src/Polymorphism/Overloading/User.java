package Polymorphism.Overloading;

public class User {
    //until i define  a constructor java will provide
    private int id;
    private String name;

    public User(){
        id=1;
        name="New User"+id;


    }

    public User(int id){
        this.id=id;
        name="New User"+id;

    }

    public User(String name){
        id=1;
        this.name=name;


    }

    public User(int id, String name){
        this.id = id;
        this.name=name;

    }

    public User(User other){
        this.id=other.id;
        this.name=other.name;
    }




}
