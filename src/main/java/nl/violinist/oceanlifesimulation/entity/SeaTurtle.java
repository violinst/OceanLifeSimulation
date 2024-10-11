package nl.violinist.oceanlifesimulation.entity;

public class SeaTurtle {

    private int health = 100;
    private int energy = 100;
    private final double jawDigestionCoefficient = 3.2;

    public void setHealth (int health) {
        this.health = health;
    }
    public int getHealth() {
        return this.health;
    }
}
