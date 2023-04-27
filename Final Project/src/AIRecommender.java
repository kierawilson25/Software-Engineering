public class AIRecommenderSystem {
    private Security security;
    private DataClerk dataClerk;
    private Concierge concierge;

    public AIRecommenderSystem() {
        security = new Security();
        dataClerk = new DataClerk();
        concierge = new Concierge();
    }

    public AIChatBots[] getAIChatbots(String userPreferences) {
        return concierge.searchForAIChatbot(userPreferences);
    }

    public AIGenerator[] getAIGenerators(String userRequirements, int budget) {
        return dataClerk.searchAIGenerator(userRequirements);
    }
}
