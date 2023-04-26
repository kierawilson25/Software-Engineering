public class Concierge {
    
    public String[] searchForAIChatbots(String userPreferences){
        String[] aIChatBots = new String[]{"ChatGPT", "Amazon Personalize"};
        return aIChatBots;

    }

    
    public AIGenerator[] getAIGenerators(String userRequirements, int budget){
        AIGenerator aIGenerator = new AIGenerator();
        AIGenerator[] aIGeneratorArray= new AIGenerator[] {aIGenerator};
        return aIGeneratorArray;
    }

}
