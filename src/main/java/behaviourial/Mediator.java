package behaviourial;

import java.util.Calendar;
import java.util.Date;

public class Mediator {
/*
Mediator pattern adds a third party object (called mediator) to control the interaction between two objects (called colleagues).
 It helps reduce the coupling between the classes communicating with each other.
Because now they don't need to have the knowledge of each other's implementation.
different from command as there the command was delegating our tasks.
here ttere are two hetrogenous objects tryingt o talk to each other

* */

    public static void main(String[] args) {

        ChatRoom mediator = new ChatRoom();

        User john = new User("John Doe", mediator);
        User jane = new User("Jane Doe", mediator);

    john.send("Hi there!");
    jane.send("Hey!");

// Output will be
// Feb 14, 10:58 [John]: Hi there!
// Feb 14, 10:58 [Jane]: Hey!
}}
   /* Here is the simplest example of a chat room (i.e. mediator) with users (i.e. colleagues) sending messages to each other.

        First of all, we have the mediator i.e. the chat room
*/
interface ChatRoomMediator
{
    public void showMessage(User user, String message);
}

// Mediator
class ChatRoom implements ChatRoomMediator
{

    @Override
    public void showMessage(User user, String message) {
        Date time = Calendar.getInstance().getTime();
        String sender = user.getName();

        System.out.println(time+sender);
    }
}
   // Then we have our users i.e. colleagues

class User {
    String   name;
    ChatRoomMediator chatMediator;

    public User(String name, ChatRoomMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        chatMediator.showMessage(this, message);
    }
}


