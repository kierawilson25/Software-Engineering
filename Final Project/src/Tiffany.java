public class Tiffany extends User {
    private AIRecommenderSystem recommenderSystem;

    public Tiffany(AIRecommenderSystem recommenderSystem) {
        this.recommenderSystem = recommenderSystem;
    }

    public void getAIGenerators() {
        AIChatBots[] generators = recommenderSystem.getAIGenerators("Text Generation", 0);
        // Get information about each AI generator
        for (AIGenerator generator : generators) {
            System.out.println("AI Generator: " + generator.getDescription());
        }
    }
}
