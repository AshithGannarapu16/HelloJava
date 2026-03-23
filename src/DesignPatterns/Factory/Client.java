package DesignPatterns.Factory;

public class Client {
    public static void main(String[] args) {

        DatabaseFactory factory=new MySQLFactory();

        Query q=factory.createQuery();
        Transaction t=factory.createTransaction();
        Updater u=factory.createUpdater();


        q.execute();
        t.begin();
        u.update();
    }
}
