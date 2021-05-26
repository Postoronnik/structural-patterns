package decorator.notifier;

public class EmailNotifier implements Notifier{
    @Override
    public void notifyUser(String notificationMessage) {
        System.out.println(notificationMessage);
    }
}
