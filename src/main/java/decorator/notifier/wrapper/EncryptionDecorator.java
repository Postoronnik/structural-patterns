package decorator.notifier.wrapper;

import decorator.notifier.Notifier;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EncryptionDecorator implements Notifier {

    private Notifier wrapper;

    @Override
    public void notifyUser(String notificationMessage) {
        byte[] bytes = code(notificationMessage);
        String message = "";
        for(int i = 0; i < bytes.length; i++){
            message += bytes[i];
        }
        wrapper.notifyUser(message);
    }

    private byte[] code(String message){
        return message.getBytes();
    }
}
