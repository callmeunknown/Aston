package com.aston;

import com.aston.enemies.Goblin;
import com.aston.heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {

        var goblin = new Goblin();
        var warrior = new Warrior("VedMak");

        while (warrior.isAlive()) {
            goblin.attackEnemy(warrior);
        }
    }
}
