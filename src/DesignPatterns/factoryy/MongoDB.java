package DesignPatterns.factoryy;

public class MongoDB extends Database {

    @Override
    public Query createQuery() {
        return new NOSQLQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RUTransaction();
    }
}
