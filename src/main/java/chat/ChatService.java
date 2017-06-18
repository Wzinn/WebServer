package chat;

public interface ChatService {

    void sendMessage(String data);

    void add(ChatWebSocket chatWebSocket);

    void remove(ChatWebSocket chatWebSocket);
}
