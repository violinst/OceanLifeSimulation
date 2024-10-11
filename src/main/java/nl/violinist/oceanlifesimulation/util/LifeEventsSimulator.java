package nl.violinist.oceanlifesimulation.util;

import nl.violinist.oceanlifesimulation.entity.SeaTurtle;

public class LifeEventsSimulator {

    public void startSimulation (SeaTurtle seaTurtle) {
        Math.random();
        while (checkStatus(seaTurtle)) {
            int simulationNumber = (int) Math.random() * 100;
            if (simulationNumber >= 0 && simulationNumber < 20) {
                sleepSimulation(seaTurtle);
            } else if (simulationNumber >= 20 && simulationNumber < 30) {
                swimSimulation(seaTurtle);
            } else if (simulationNumber >= 30 && simulationNumber < 40) {
                eatingFishSimulation(seaTurtle);
            } else if (simulationNumber >= 40 && simulationNumber < 50) {
                eatingSeaweedSimulation(seaTurtle);
            } else if (simulationNumber >= 50 && simulationNumber < 60) {
                eatingJellyfishSimulation(seaTurtle);
            } else if (simulationNumber >= 60 && simulationNumber < 70) {
                notEatingSimulation(seaTurtle);
            } else if (simulationNumber >= 70 && simulationNumber < 80) {
                sharkAttackSimulation(seaTurtle);
            } else if (simulationNumber >= 80 && simulationNumber < 85) {
                findingOceanStreamSimulation(seaTurtle);
            } else if (simulationNumber >= 85 && simulationNumber < 90) {
                eatingPlasticSimulation(seaTurtle);
            } else if (simulationNumber >= 90 && simulationNumber < 100) {
                layingEggsSimulation(seaTurtle);
            }
        }
        System.out.println("Oh noo!!! Sea turtle is dead! Game over!");
    }

    private void sleepSimulation(SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        stamina = stamina + 10;
        if (stamina > 100) {
            stamina = 100;
        }

        seaTurtle.setStamina(stamina);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle slept! She gained 10 stamina points.");
    }

    private void swimSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        stamina = stamina - 4;
        if (stamina < 0) {
            stamina = 0;
        }

        seaTurtle.setStamina(stamina);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle was swimming the whole day. She spent 4 stamina points.");
    }

    private void eatingFishSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        int health = seaTurtle.getHealth();
        stamina = stamina - 7;
        if (stamina < 0) {
            stamina = 0;
        }

        health = health + (int) (seaTurtle.getJawDigestionCoefficient() * 4);
        if (health > 100) {
            health = 100;
        }

        seaTurtle.setStamina(stamina);
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle ate a fish. She spent 7 stamina points and gained " + seaTurtle.getJawDigestionCoefficient() * 4 + "health points.");
    }

    private void eatingSeaweedSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        int health = seaTurtle.getHealth();
        stamina = stamina - 6;
        if (stamina < 0) {
            stamina = 0;
        }

        health = health + (int) (seaTurtle.getJawDigestionCoefficient() * 3);
        if (health > 100) {
            health = 100;
        }

        seaTurtle.setStamina(stamina);
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle ate some seaweed. She spent 6 stamina points and gained " + seaTurtle.getJawDigestionCoefficient() * 3 + "health points.");
    }

    private void eatingJellyfishSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        int health = seaTurtle.getHealth();
        stamina = stamina - 4;
        if (stamina < 0) {
            stamina = 0;
        }

        health = health + (int) (seaTurtle.getJawDigestionCoefficient() * 4);
        if (health > 100) {
            health = 100;
        }

        seaTurtle.setStamina(stamina);
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle ate a jellyfish. She spent 4 stamina points and gained " + seaTurtle.getJawDigestionCoefficient() * 4 + "health points.");
    }



    private void notEatingSimulation (SeaTurtle seaTurtle) {
        int health = seaTurtle.getHealth();
        health = health - 4;
        if (health < 0) {
            health = 0;
        }

        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle didn't eat the whole day. She lost 4 health points.");
    }

    private void sharkAttackSimulation(SeaTurtle seaTurtle) {
        int health = seaTurtle.getHealth();
        health = health - 20;
        if (health < 0) {
            health = 0;
        }

        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle was attacked by a shark. She lost 20 health points.");
    }

    private void findingOceanStreamSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        stamina = stamina + 5;
        if (stamina > 100) {
            stamina = 100;
        }

        seaTurtle.setStamina(stamina);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle found an ocean stream to swim with! She gained 5 stamina points.");
    }

    private void eatingPlasticSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        int health = seaTurtle.getHealth();
        stamina = stamina - 4;
        if (stamina < 0) {
            stamina = 0;
        }

        health = health - (int) (seaTurtle.getJawDigestionCoefficient() * 2);
        if (health < 0) {
            health = 0;
        }

        seaTurtle.setStamina(stamina);
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle ate plastic. She spent 4 stamina points and lost " + seaTurtle.getJawDigestionCoefficient() * 2 + "health points.");
    }

    private void layingEggsSimulation (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        int health = seaTurtle.getHealth();
        stamina = stamina - 10;
        if (stamina < 0) {
            stamina = 0;
        }

        health = health + 5;
        if (health > 100) {
            health = 100;
        }

        seaTurtle.setStamina(stamina);
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle laid eggs on the beach. She spent 10 stamina points and gained 5 health points.");
    }

    private boolean checkStatus(SeaTurtle seaTurtle) {
        System.out.println("hp: " + seaTurtle.getHealth() + "stamina: " + seaTurtle.getStamina());
        if (seaTurtle.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkStamina(SeaTurtle seaTurtle) {
        if (seaTurtle.getStamina() <= 0) {
            int health = seaTurtle.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            seaTurtle.setHealth(health);
        }
    }


}
