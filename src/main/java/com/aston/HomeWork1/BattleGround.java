package com.aston.HomeWork1;

import com.aston.HomeWork1.enemies.Goblin;
import com.aston.HomeWork1.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {

        var goblin = new Goblin();
        var warrior = new Warrior("VedMak");

        while (warrior.isAlive()) {
            goblin.attackEnemy(warrior);
        }
    }
}
