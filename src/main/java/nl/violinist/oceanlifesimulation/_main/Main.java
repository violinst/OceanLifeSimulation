package nl.violinist.oceanlifesimulation._main;

import nl.violinist.oceanlifesimulation.entity.SeaTurtle;
import nl.violinist.oceanlifesimulation.util.LifeEventsSimulator;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SeaTurtle seaTurtle = new SeaTurtle();
        LifeEventsSimulator lifeEventsSimulator = new LifeEventsSimulator();
        lifeEventsSimulator.startSimulation(seaTurtle);

    }
}
