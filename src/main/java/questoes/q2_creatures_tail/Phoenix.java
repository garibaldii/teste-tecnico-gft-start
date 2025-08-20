package questoes.q2_creatures_tail;

public class Phoenix extends  Creature{

    public Phoenix(String name, String power, double strenght) {
        super(name, power, strenght);
    }

    @Override
    double getTotalStrenght() {
        return getStrenght() * 1.3;
    }
}
