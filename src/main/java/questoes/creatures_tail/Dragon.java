package questoes.creatures_tail;

public class Dragon  extends Creature{


    public Dragon(String name, String power, double strenght) {
        super(name, power, strenght);
    }

    @Override
    double getTotalStrenght() {
        return getStrenght() * 1.5;
    }
}
