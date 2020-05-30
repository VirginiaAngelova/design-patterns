package chatRoom;

public interface ChatRoom {
	void sendMessage(String message, UserMediator userMediator);
	 void addUser(UserMediator userMediator);
	 void delete(String message,UserMediator userMediator);
}
