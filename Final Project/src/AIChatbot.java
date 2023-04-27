import java.util.ArrayList;

public class AIChatbot {

    private String name;
    private String description;
    private String link;

    public AIChatbot(String name, String description, String link) {
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
