package org.example.models;

public class Player extends Entity{
    public Player(int x, int y, int hp, int dmg) {
        super(x, y, hp, dmg);
    }

    @Override
    public boolean isEnemy() {
        return false;
    }
}
