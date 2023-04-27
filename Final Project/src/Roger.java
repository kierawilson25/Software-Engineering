public class Roger {
    private Concierge concierge;
    private DataClerk dataClerk;

    public Roger(Concierge concierge, DataClerk dataClerk) {
        this.concierge = concierge;
        this.dataClerk = dataClerk;
    }

    public AIChatBots[] searchForAIChatbots(String userPreferences) {
        return concierge.searchForAIChatbot(userPreferences);
    }

    public String getAIDescription(AIChatbot chatbot) {
        return concierge.getAIDescription(chatbot);
    }

    public AIGenerator[] getAIGenerators(String userRequirements, int budget) {
        return dataClerk.searchAIGenerator(userRequirements);
    }
}
