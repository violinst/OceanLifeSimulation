package nl.violinist.oceanlifesimulation.entity;

public class SeaTurtle {

    private int health = 100;
    private int stamina = 100;
    private final double jawDigestionCoefficient = 2.2;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public double getJawDigestionCoefficient() {
        return jawDigestionCoefficient;
    }

}
