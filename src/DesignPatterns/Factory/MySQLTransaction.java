package DesignPatterns.Factory;

public class MySQLTransaction implements Transaction {

    @Override
    public void begin(){
        System.out.println("MYSQL Transaction");
    }

}
