import java.io.*;

public class Assassin {
    private String name;
    private int skillLevel;

    public Assassin(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }

    // To get the name
    public String getName() {
        return this.name;
    }

    // To get skill level
    public int getSkillLevel() {
        return this.skillLevel;
    }

    public String toString() {
        return name + " (" + skillLevel + ")";
    }

    public static void main(String[] args) throws IOException {
        AssassinManager assassin = new AssassinManager("src\\Assassin.txt");
        assassin.play();

    }


}
