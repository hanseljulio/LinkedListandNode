import java.io.*;
import java.util.*;

public class AssassinManager {
    private static final List<String> weapons = Arrays.asList(
            "a repulsor blast", "Stormbreaker", "a big smash", "an arrow in the knee", "a vibranium shield"
    );

    private static final List<String> victory = Arrays.asList(
            "Winner winner, chicken dinner. ", "Victory Royale. ", "They should have gone for the head. "
    );

    private List<String> deathRecaps = new ArrayList<>();

    private LinkedList<Assassin> killRing = new LinkedList<>();

    public AssassinManager(String filePath) throws IOException {
        Scanner in = new Scanner(new File(filePath));
        System.out.print("Kill Ring: ");
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner lineScan = new Scanner(line);
            String name = lineScan.next();
            String skill = lineScan.next();
            Assassin player = new Assassin(name.substring(0, name.length() - 1), Integer.parseInt(skill));
            Node<Assassin> node = new Node<>(player); // put it into a node, place it inside the linkedlist
            killRing.add(node);
            System.out.print(node + " > ");
        }
        System.out.print(killRing.getFirst());
        System.out.println("\n");
    }

    public Node<Assassin> getNextVictim() {
        int max = Integer.MIN_VALUE;
        Node<Assassin> potentialVictim = null; // list of victims
        Node<Assassin> current = killRing.getFirst(); // current = first
        while (current.getNext() != null) { // Skill difference check
            int skillDifference = current.getData().getSkillLevel() - current.getNext().getData().getSkillLevel();
            if (skillDifference > max) {
                max = skillDifference;
                potentialVictim = current.getNext(); // add next as potential victim if current is bigger than the next
            }
            current = current.getNext();

            if (current.getNext() == null) { // Targets the end of the list to the front
                int first = killRing.getFirst().getData().getSkillLevel();
                int firstDifference = current.getData().getSkillLevel() - first;
                if (firstDifference > max) {
                    max = firstDifference;
                    potentialVictim = killRing.getFirst();
                }
            }
        }
        return potentialVictim; // returns victims
    }

    public void play() {
        String win = victory.get(new Random().nextInt(victory.size()));
        while (killRing.getFirst().getNext() != null) {
            String weapon = weapons.get(new Random().nextInt(weapons.size()));
            Node<Assassin> target = getNextVictim();
            Node<Assassin> assassin = killRing.getParent(target);
            if (killRing.getFirst().equals(target)) {
                assassin = killRing.getLast(); // Need a new method getLast() for this problem, targets the last with the first
            }
            killRing.remove(target.getData());
            String recap = assassin.getData().getName() + " killed " + target.getData().getName();
            String death = " with " + weapon + "\n";
            System.out.println(recap + death);
            deathRecaps.add(recap);
        }
        System.out.println(win + killRing.getFirst().getData().getName() + " wins." + "\n");
        System.out.println(deathRecap());
    }

    public String deathRecap() {
        String recap = "";
        System.out.println("Death recap: ");
        for (int i = 0; i < deathRecaps.size(); i++) {
            recap += deathRecaps.get(i) + "\n";

        }
        return recap;

    }

}
