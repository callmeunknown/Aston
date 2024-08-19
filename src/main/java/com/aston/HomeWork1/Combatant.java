package com.aston.HomeWork1;;

public interface Combatant {
    int getAttack();
    String getName();

    void takeDamage(int damage);

    default void attackEnemy(Combatant enemy) {
        System.out.println(getName() + " атакует " + enemy.getName());
        enemy.takeDamage(getAttack());
    }
}
