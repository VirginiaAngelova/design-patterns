package chatRoom;

public class ChatUser extends UserMediator {

	public ChatUser(ChatRoom chatRoom, String nickname) {
		super(chatRoom, nickname);
		chatRoom.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.nickname + " says: " + message);
		chatRoom.sendMessage(message, this);


	}

	@Override
	public void recieve(String message) {
		System.out.println(this.nickname + " received: " + message);
	}

	@Override
	public void delete(String message) {
		System.out.println(this.nickname + " received: " + message);
		
	}

}
