package DesignPatterns.Factory;

public class MySQLUpdater implements Updater {

    @Override
    public void update() {
        System.out.println("MYSQL update");
    }
}
