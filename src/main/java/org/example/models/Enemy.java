package org.example.models;

public class Enemy extends Entity{

    public Enemy(int x, int y, int hp, int dmg) {
        super(x, y, hp, dmg);
    }

    @Override
    public boolean isEnemy() {
        return true;
    }
}
