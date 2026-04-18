package DesignPatterns.factoryy;

import java.util.Scanner;

public class Client {
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String databaseName = scanner.nextLine();

//        Database d=null;
//        if(databaseName.equals("MySQL")){
//            d=new MySQL();
//        }else if(databaseName.equals("mongodb")){
//            d=new MongoDB();
//        }

        Database db=DatabaseFactory.createDatabaseByName(databaseName);



//        Query q=null;
//
//        if(databaseName.equals("MySQL")){
//            q=new SQLQuery();
//
//        }else if(databaseName.equals("mongodb")){
//            q=new NOSQLQuery();
//        }

        Query q = db.createQuery();

    }
}
