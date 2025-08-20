package questoes.q2_creatures_tail;

public class Griff extends Creature{


    public Griff(String name, String power, double strenght) {
        super(name, power, strenght);
    }

    @Override
    double getTotalStrenght() {
        return getStrenght() * 1.2;
    }
}
