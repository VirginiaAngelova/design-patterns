package chatRoom;
public class ChatRoomMain {
	public static void main(String[] args) {
		ChatRoom chatRoom = new MessageChatMediator();
		
		UserMediator user1 = new ChatUser(chatRoom, "Ivan");
		UserMediator user2 = new ChatUser(chatRoom, "Georgi");
		UserMediator user3 = new ChatUser(chatRoom, "Petur");
		
		user1.send("Hello gays!");
		user2.send("addBot");
		user3.send("cat");

		user3.send("sorry");
		user1.send("Did he said wrong word?");
		user1.send("cat");
	
		user1.send("sorry also");
		user2.send("I am the only one in the chat now :(");
	}
}