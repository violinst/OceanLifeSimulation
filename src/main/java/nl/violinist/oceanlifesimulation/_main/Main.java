package nl.violinist.oceanlifesimulation._main;

import nl.violinist.oceanlifesimulation.entity.SeaTurtle;
import nl.violinist.oceanlifesimulation.util.LifeEventSimulator;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SeaTurtle seaTurtle = new SeaTurtle();
        LifeEventSimulator lifeEventSimulator = new LifeEventSimulator();
        lifeEventSimulator.startSimulation(seaTurtle);
    }
}
