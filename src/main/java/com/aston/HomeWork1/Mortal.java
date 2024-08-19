package com.aston.HomeWork1;

public interface Mortal {
    int getHealth();

    default boolean isAlive() {
        return getHealth() > 0;
    }
}
