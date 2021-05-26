package fasade.fasade;

import fasade.message_sending_complex.MessageCoding;
import fasade.message_sending_complex.MessageConfigurator;
import fasade.message_sending_complex.MessageManager;

public class Messenger {

    public void writeMessage(String message){
        byte[] messageCode = MessageCoding.codeMessage(message);
        String formatMessage = MessageConfigurator.formatMessage(messageCode);
        MessageManager.sendMessage(formatMessage);
    }

    public String receiveMessage(){
        String receivedMessage = MessageManager.receiveMessage();
        byte[] codedMessage = MessageConfigurator.extractBytes(receivedMessage);
        return "Received new message: " + MessageCoding.decodeMessage(codedMessage);
    }
}
