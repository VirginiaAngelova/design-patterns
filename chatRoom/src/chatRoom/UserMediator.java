package chatRoom;

public abstract class UserMediator {

	protected ChatRoom chatRoom;
	protected String nickname;
	
	public UserMediator(ChatRoom chatRoom,String nickname) {
		this.chatRoom = chatRoom;
		this.nickname = nickname;
	}
	public abstract void send(String message);
	public abstract void recieve(String message);
	public abstract void delete(String message);
}
