package DesignPatterns.factoryy;

public class MySQL extends  Database {

    @Override
    public Query createQuery() {
        return new  SQLQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RUTransaction();
    }
}
