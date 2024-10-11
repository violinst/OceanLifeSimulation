package nl.violinist.oceanlifesimulation.util;

import nl.violinist.oceanlifesimulation.entity.SeaTurtle;

public class LifeEventsSimulator {

    public void startSimulation (SeaTurtle seaTurtle) {

    }
    private void sleepSimulation(SeaTurtle seaTurtle) {
        int energy = seaTurtle.getEnergy();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        seaTurtle.setEnergy(energy);
        System.out.println("Sea Turtle slept!");
    }

}
