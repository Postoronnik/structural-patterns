package fasade.entry.point;

import fasade.fasade.Messenger;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.writeMessage("Hello ya!!!!");
        System.out.println();
        System.out.println(messenger.receiveMessage());
    }
}
