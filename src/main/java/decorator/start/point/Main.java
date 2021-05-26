package decorator.start.point;

import decorator.notifier.EmailNotifier;
import decorator.notifier.Notifier;
import decorator.notifier.wrapper.CopyDecorator;
import decorator.notifier.wrapper.EncryptionDecorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.notifyUser("Notify from email");

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(new EmailNotifier());
        encryptionDecorator.notifyUser("Notify with encryption");

        CopyDecorator copyDecorator = new CopyDecorator(new EncryptionDecorator(new EmailNotifier()));
        copyDecorator.notifyUser("Notify with encryption and copying");

        System.out.println(copyDecorator.getCopiedMessage());
    }
}
