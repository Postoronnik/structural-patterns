package fasade.message_sending_complex;


public class MessageConfigurator {

    public static byte[] extractBytes(String message){
        System.out.println("Extracting message code...");

        String[] splitBySpace = message.split(" ");

        byte[] bytes = new byte[splitBySpace.length];
        for(int i = 0; i < splitBySpace.length; i++){
            bytes[i] = Byte.parseByte(splitBySpace[i]);
        }
        System.out.println("Code extracted");
        return bytes;
    }

    public static String formatMessage(byte[] bytes){
        System.out.println("Converting code to message...");
        String message = "";

        for (int i = 0 ; i < bytes.length; i++){
            message += bytes[i] + ' ';
        }

        System.out.println("Code converted");

        return message;
    }
}
