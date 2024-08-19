package com.aston;

public interface Mortal {
    int getHealth();

    default boolean isAlive() {
        return getHealth() > 0;
    }
}
