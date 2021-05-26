package decorator.notifier.wrapper;

import decorator.notifier.Notifier;
import lombok.Getter;

@Getter
public class CopyDecorator extends EncryptionDecorator {

    private String copiedMessage;

    public CopyDecorator(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void notifyUser(String notificationMessage){
        copy(notificationMessage);
        super.notifyUser(notificationMessage);
    }

    private void copy(String copiedMessage){
        this.copiedMessage = copiedMessage;
    }
}
