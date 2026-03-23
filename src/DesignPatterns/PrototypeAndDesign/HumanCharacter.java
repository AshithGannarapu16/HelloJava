package DesignPatterns.PrototypeAndDesign;

public class HumanCharacter  extends Character {

    public HumanCharacter(String id, String name, int power, String icon) {
        super(id, name,  power, icon );
    }

    public HumanCharacter(HumanCharacter other) {
        super(other);
        //copy anything else as well
    }

    @Override
    public HumanCharacter copy(Character character) {
        System.out.println("HumanCharacter copy is called");
        HumanCharacter humanCharacter=new HumanCharacter((HumanCharacter) character);
//        super.copy(character);
        return humanCharacter;

    }
}
