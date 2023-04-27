public class AIGenerator {
    private String name;
    private String description;
    private String link;

    public AIGenerator(String name, String description, String link) {
        this.name = name;
        this.description = description;
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }
}
