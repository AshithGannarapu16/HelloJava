package DesignPatterns.factoryy;

public abstract  class Database {

    public abstract Query createQuery();

    public abstract  Transaction createTransaction();






}
