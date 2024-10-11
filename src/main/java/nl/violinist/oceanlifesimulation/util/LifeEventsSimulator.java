package nl.violinist.oceanlifesimulation.util;

import nl.violinist.oceanlifesimulation.entity.SeaTurtle;

public class LifeEventsSimulator {

    public void startSimulation (SeaTurtle seaTurtle) {

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
        if(health > 100) {
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
        if(health > 100) {
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
        if(health > 100) {
            health = 100;
        }
        seaTurtle.setStamina(stamina);
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle ate a jellyfish. She spent 4 stamina points and gained " + seaTurtle.getJawDigestionCoefficient() * 4 + "health points.");
    }



    private void notEating (SeaTurtle seaTurtle) {
        int health = seaTurtle.getHealth();
        health = health - 4;
        if(health < 0) {
            health = 0;
        }
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle didn't eat the whole day. She lost 4 health points.");
    }

    private void sharkAttack(SeaTurtle seaTurtle) {
        int health = seaTurtle.getHealth();
        health = health - 20;
        if(health < 0) {
            health = 0;
        }
        seaTurtle.setHealth(health);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle was attacked by a shark. She lost 20 health points.");
    }

    private void findingOceanStream (SeaTurtle seaTurtle) {
        int stamina = seaTurtle.getStamina();
        stamina = stamina + 5;
        if (stamina > 100) {
            stamina = 100;
        }

        seaTurtle.setStamina(stamina);
        checkStamina(seaTurtle);
        System.out.println("Sea Turtle found an ocean stream to swim with! She gained 5 stamina points.");
    }






    private boolean checkStatus(SeaTurtle seaTurtle) {
        System.out.println("hp: " + seaTurtle.getHealth() + "stamina: " + seaTurtle.getStamina());
        if(seaTurtle.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }
    private void checkStamina(SeaTurtle seaTurtle) {
        if(seaTurtle.getStamina() <= 0) {
            int health = seaTurtle.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            seaTurtle.setHealth(health);
        }
    }


}
