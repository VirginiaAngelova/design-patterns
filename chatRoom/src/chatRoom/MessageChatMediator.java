package chatRoom;

import java.util.ArrayList;
import java.util.List;

public class MessageChatMediator implements ChatRoom {
	private List<UserMediator>users;
	private boolean isBotAdded;
	
	public  MessageChatMediator() {
		this.users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, UserMediator userMediator) {
	    if (!users.contains(userMediator)){
	        return;
        }
        System.out.println(userMediator.nickname + " says: " + message);
		for(UserMediator u: this.users) {
			if(u != userMediator) {
				u.recieve(message);
			}
		}
		if(message.equals("addBot")){
			isBotAdded=true;
			System.out.println("Bot was added");
			return;
		}
        if (message.equals("cat")){
            this.delete("cat",userMediator);
        }
	}
	
	@Override
	public void addUser(UserMediator userMediator) {
		this.users.add(userMediator);
	}
	
	@Override
	public void delete(String message, UserMediator userMediator) {
        if (message.equals("cat")){
            users.remove(userMediator);
            System.out.println(userMediator.nickname+" was removed from the chat.'Cat' is forbidden word.");
            return;
        }
		for(UserMediator u: this.users) {
			if(u != userMediator) {
				u.recieve(message);
			}
		}
	}
}