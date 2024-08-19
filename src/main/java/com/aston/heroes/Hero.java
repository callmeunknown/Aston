package com.aston.heroes;

import com.aston.Combatant;
import com.aston.Mortal;

public abstract class Hero implements Mortal, Combatant {
    private String name;
    private int health;
    private int attack;

    Hero(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " получает " + damage + " урона. Осталось здоровья: " + this.health);
    }

    @Override
    public int getAttack() {
        return this.attack;
    }
}
