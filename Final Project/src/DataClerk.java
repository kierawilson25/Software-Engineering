public class DataClerk {

    public String[] searchAIChatbot(String query) {
        String[] aIChatBots = new String[]{query};
        return aIChatBots;
    }

    public AIGenerator[] searchAIGenerator(String query) {
        AIGenerator aIGenerator = new AIGenerator(query);
        AIGenerator[] aIGeneratorArray= new AIGenerator[] {aIGenerator};
        return aIGeneratorArray;
    }
}
