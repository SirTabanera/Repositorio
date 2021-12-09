package main;

public class Item {
    private Integer identifier;
    private String name;
    private Integer family;

    public Item(){}

    public Item(Integer identifier, String name, Integer family){
        this.identifier= identifier;
        this.name =name;
        this.family= family;
    }
    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identificador) {
        this.identifier = identificador;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getFamily() {
        return family;
    }
    public void setFamilia(Integer family) {
        this.family= family;
    }
}
