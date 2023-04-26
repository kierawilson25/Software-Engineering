public class Roger extends Concierge {
    Concierge concierge;
    DataClerk dataClerk;
    
    public AIChatbot[] searchForAIChatbot(String userPreferences){
        AIChatbot aiChatbot = new AIChatbot();
        AIChatbot aiChatbot2 = new AIChatbot();
        AIChatbot[] aiChatbotArray = new AIChatbot[]{aiChatbot, aiChatbot2};
        return aiChatbotArray;
    }

    public String getAIDescription(AIChatbot chatbot){
        return "Chatbot";
    }
    
    public AIGenerator[] getAIGenerators(String userRequirements, int budget){
        AIGenerator aiGenerator = new AIGenerator();
        AIGenerator aiGenerator2 = new AIGenerator();
        AIGenerator[] aiGeneratorArray = new AIGenerator[]{aiGenerator, aiGenerator2};
        return aiGeneratorArray;
    }

}
