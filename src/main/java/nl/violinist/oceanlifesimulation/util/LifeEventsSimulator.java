package nl.violinist.oceanlifesimulation.util;

import nl.violinist.oceanlifesimulation.entity.SeaTurtle;

public class LifeEventsSimulator {

    public void startSimulation (SeaTurtle seaTurtle) {

    }
    private void sleepSimulation(SeaTurtle seaTurtle) {
        int energy = seaTurtle.getEnergy();
        energy = energy + 10;
        if (energy > 100) {
            energy = 100;
        }
        seaTurtle.setEnergy(energy);
        System.out.println("Sea Turtle slept! She gained 10 energy");
    }
    private void swimSimulation (SeaTurtle seaTurtle) {
        int energy = seaTurtle.getEnergy();
        energy = energy - 4;
        if (energy < 0) {
            energy = 0;
        }
        seaTurtle.setEnergy(energy);
        System.out.println("Sea Turtle was swimming the whole day. She spent 4 energy:");
    }
    private void eatingFishSimulation (SeaTurtle seaTurtle) {
        int energy = seaTurtle.getEnergy();
        int health = seaTurtle.getHealth();
        energy = energy - 7;
        if (energy < 0) {
            energy = 0;
        }

        health = health + (int) (seaTurtle.getJawDigestionCoefficient() * 4);
        if(health > 100) {
            health = 100;
        }
        seaTurtle.setEnergy(energy);
        seaTurtle.setHealth(health);
        System.out.println("Sea Turtle ate a fish. She spent 7 energy and gained " + seaTurtle.getJawDigestionCoefficient() * 4 + "health.");
    }

}
