package DesignPatterns.PrototypeAndDesign;

public class Client {

    public static  void someMethod(Character character){
//        Character character1=new Character(character);
        character.copy(character);

//        if(character instanceof HumanCharacter){
////            character1=new HumanCharacter((HumanCharacter)character);
//        }
//        else if(character instanceof ZombieCharacter){
//            character1=new ZombieCharacter((ZombieCharacter)character);
//        }
//        else if(character instanceof PlantCharacter){
//            character1=new PlantCharacter((PlantCharacter)character);
//        }
//        else{
//            character1=null;
//        }

    }
    public static void main(String[] args) {
        Character character=new Character("1", "XYZ", 100, "SomeIcon");



        HumanCharacter humanCharacter=new HumanCharacter("2", "Human", 80, "SomeIn");

        ZombieCharacter zombieCharacter=new ZombieCharacter("3", "Zombie", 100, "SomeIn");

        someMethod(character);
        someMethod(humanCharacter);
//        someMethod(zombieCharacter);
//        someMethod(character);


    }
}
