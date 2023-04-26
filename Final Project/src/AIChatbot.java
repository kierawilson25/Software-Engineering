import java.util.ArrayList;

public class AIChatbot {

    static ArrayList<AIChatbot> chatbotList = new ArrayList<AIChatbot>();

    public AIChatbot(){
        chatbotList.add(this);
    }

    public static ArrayList<AIChatbot> getChatbotList(){
        return chatbotList;
    }
}
