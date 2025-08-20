package questoes.creatures_tail;

import java.util.ArrayList;
import java.util.List;

public class CreatureController {

    public String getMostBrutalCreature(List<Creature> creatures) {
        if (creatures == null || creatures.isEmpty()) {
            return null;
        }

        Creature mostBrutal = creatures.get(0);

        for (Creature creature : creatures) {

            if (creature.getTotalStrenght() > mostBrutal.getTotalStrenght()) {
                mostBrutal = creature;
            }
        }

        return "Criatura mais poderosa: " + mostBrutal.getName() + "(Poder: " + mostBrutal.getPower() + "Força Total: " + mostBrutal.getTotalStrenght() + ")";
    }


    public static void main (String[] args) {
        CreatureController c = new CreatureController();
        List<Creature> creatures = new ArrayList<>();
        creatures.add(new Phoenix("Phoenix", "Fire", 120));
        creatures.add(new Griff("Griff", "Ice", 120));
        creatures.add(new Dragon("Dragon", "Lightning", 120));

        System.out.println(c.getMostBrutalCreature(creatures));
    }
}
