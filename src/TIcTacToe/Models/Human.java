package TicTacToe.Models;

public class Human extends  Player{

    private  Integer age;
    private  String FriendlyName;

    private  Integer level;

    public Human(Long id,String name, Symbol symbol,String friendlyName) {
        super(id,name,symbol,PlayerType.HUMAN);
        this.level=1;

    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFriendlyName() {
        return FriendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        FriendlyName = friendlyName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
