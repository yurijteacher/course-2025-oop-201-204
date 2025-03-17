package ua.com.kneu.groupe_203.lab2.aggregation;

public class Engine {

    private Long id;
    private String name;
    private String description;
    private SizeEngine sizeEngine;

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sizeEngine=" + sizeEngine +
                '}';
    }

    public Engine() {
    }

    public Engine(Long id, String name, String description, SizeEngine sizeEngine) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sizeEngine = sizeEngine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SizeEngine getSizeEngine() {
        return sizeEngine;
    }

    public void setSizeEngine(SizeEngine sizeEngine) {
        this.sizeEngine = sizeEngine;
    }
}
