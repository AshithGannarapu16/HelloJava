package DesignPatterns.PrototypeAndDesign;

public class Character implements Prototype<Character>{
    private String id;
    private String name;

    private int power;
    private String icon;

    public Character(String id, String name, int power, String icon) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.icon = icon;
    }

    public Character(Character other) {
        this.id = other.id;
        this.name = other.name;
        this.power = other.power;
        this.icon = other.icon;
    }

    @Override
    public Character copy(Character character) {
        System.out.println("Character copy is called");
        return new Character(character);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getIcon() {
        return icon;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
