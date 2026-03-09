package Polymorphism.Overriding.Notification;

public class UpdatedNotificationService {
    public void sendNotifiction(EmailNotification notification){
        notification.notifyUser();
    }

    public void sendAll(Notification[] notifications){

        for(Notification notification : notifications){
            notification.notifyUser();
        }
//        for(SMSNotification smsNotification : smsNotifications){
//            smsNotification.notifyUser();
//        }
//        for(EmailNotification emailNotification : emailNotifications){
//            emailNotification.notifyUser();
//        }
//
    }


}
