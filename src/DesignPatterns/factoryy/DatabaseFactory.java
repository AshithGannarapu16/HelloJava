package DesignPatterns.factoryy;

public class DatabaseFactory {

    public static Database createDatabaseByName(String databaseName){
        Database d=null;
        if(databaseName.equals("MySQL")){
            d=new MySQL();
        }else if(databaseName.equals("mongodb")){
            d=new MongoDB();
        }
        return d;

    }
}
