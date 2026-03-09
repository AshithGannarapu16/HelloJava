package Polymorphism.Overriding.Notification;

public class Client {
    public static void main(String[] args) {
        Notification notification = new Notification();

        UpdatedNotificationService updatedNotificationService = new UpdatedNotificationService();

        Notification[] notifications = {new Notification(),
        new EmailNotification(), new SMSNotification(), new EmailNotification() };

        updatedNotificationService.sendAll(notifications);
    }
}
