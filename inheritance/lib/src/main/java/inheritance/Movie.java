package inheritance;

public class Movie {
    // The properties
    private String name, description;

    public Movie(String name ,String description){
        this.name = name;
        this.description = description;
    }

    // all getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // all setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
