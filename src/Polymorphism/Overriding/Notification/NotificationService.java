package Polymorphism.Overriding.Notification;

public class NotificationService {
    public void sendNotification(Notification notification){
        notification.notifyUser();

    }

    public void sendNotifiction(EmailNotification notification){
        notification.notifyUser();
    }

    public void sendNotifiction(SMSNotification notification){
        notification.notifyUser();
    }

    public  void sendAll(Notification[] notifications,
                         SMSNotification[] smsNotifications,
                         EmailNotification[] emailNotifications){

        for(Notification notification : notifications){
            notification.notifyUser();
        }

        for(SMSNotification smsNotification : smsNotifications){
            smsNotification.notifyUser();
        }
        for( EmailNotification emailNotification : emailNotifications){
            emailNotification.notifyUser();
        }

    }

}
