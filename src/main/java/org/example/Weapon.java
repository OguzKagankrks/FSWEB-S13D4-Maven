package org.example;

public enum Weapon {
    SWORD;

    private double attackSpeed;
    private int damage;


    Weapon () {
        this.attackSpeed = attackSpeed;
        this.damage = damage;


    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
}
