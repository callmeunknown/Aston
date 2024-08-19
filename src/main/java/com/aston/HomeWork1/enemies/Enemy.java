package com.aston.HomeWork1.enemies;

import com.aston.HomeWork1.Combatant;
import com.aston.HomeWork1.Mortal;

public abstract class Enemy implements Mortal, Combatant {
    private String name;
    private int health;
    private int attack;

    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
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
