package org.example;
import org.example.Weapon;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }
    public int healthRemaining(){
        if (healthPercentage > 100){
            healthPercentage = 100;
        } else if (healthPercentage < 0){
            healthPercentage = 0;
        }
        return healthPercentage;

    }
    public void loseHealth(int damage){
       this.healthPercentage = healthPercentage - damage;
       if (healthPercentage <=0 ){
           System.out.println(name + " player has been knocked out of game");

       }
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage = healthPercentage + healthPotion;
        if (healthPercentage > 100){
            healthPercentage = 100;
        }
    }

}
