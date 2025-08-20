package questoes.creatures_tail;

public abstract class Creature {

    private String name;
    private String power;
    private double strenght;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getStrenght() {
        return strenght;
    }

    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }

    public Creature(String name, String power, double strenght) {
        this.name = name;
        this.power = power;
        this.strenght = strenght;
    }

    abstract double getTotalStrenght();
}
