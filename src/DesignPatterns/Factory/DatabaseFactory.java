package DesignPatterns.Factory;

public interface DatabaseFactory {

    Query createQuery();

    Transaction createTransaction();

    Updater createUpdater();
}
