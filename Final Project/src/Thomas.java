public class Thomas extends User {
    private AIRecommenderSystem recommenderSystem;

    public Thomas(AIRecommenderSystem recommenderSystem) {
        this.recommenderSystem = recommenderSystem;
    }

    public void searchForAIChatbots() {
        AIChatBots[] chatbots = recommenderSystem.getAIChatbots("AI Chatbots");
        // Get information about each chatbot
        for (AIChatbot chatbot : chatbots) {
            System.out.println("AI Chatbot: " + chatbot.getDescription());
        }
    }
}
