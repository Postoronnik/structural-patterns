package fasade.message_sending_complex;

public class MessageCoding {

    public static byte[] codeMessage(String message){
        System.out.println("Codding message...");
        System.out.println("Message coded");
        return message.getBytes();
    }

    public static String decodeMessage(byte[] codedMessage){
        System.out.println("Decoding message...");
        System.out.println("Message decoded");
        return new String(codedMessage);
    }
}
