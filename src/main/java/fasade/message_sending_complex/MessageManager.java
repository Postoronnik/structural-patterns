package fasade.message_sending_complex;

public class MessageManager {

    private static String receivedMessage = "Hello from sender";

    public static void sendMessage(String message){
        System.out.println("Message sending...");
        System.out.println("Message " + message + " sent");
    }

    public static String receiveMessage(){
        System.out.println("Receiving message...");
        byte[] bytes = receivedMessage.getBytes();
        String message = "";
        for(int i = 0; i < bytes.length; i++){
            message += bytes[i] + " ";
        }
        return message;
    }
}
