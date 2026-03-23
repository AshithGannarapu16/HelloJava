package DesignPatterns.Factory;

public class MySQLFactory implements DatabaseFactory{

    @Override

    public Query createQuery() {
        return new MySQLQuery();
    }

    @Override
    public  Transaction createTransaction() {
        return new MySQLTransaction();
    }

    @Override
    public Updater createUpdater() {
        return new MySQLUpdater();
    }
}
