package org.example.models;

public abstract class Entity implements Object {
    private int poseX;
    private int poseY;
    private int HEALTH;
    private int DAMAGE;
    private boolean isAlive = false;

    public Entity(int x, int y, int hp, int dmg) {
        isAlive = true;
        this.poseX = x;
        this.poseY = y;
        this.HEALTH = hp;
        this.DAMAGE = dmg;
    }

    public void move(int x, int y) {
        poseX = x;
        poseY = y;
    }

    public int attack() {
        return DAMAGE;
    }

    public void takeDamage(int damage) {
        if (this.HEALTH >= damage) {
            this.HEALTH -= damage;
        } else {
            doNothing();
        }
    }

    public void doNothing() {
    }

    public int getPoseX() {
        return poseX;
    }

    public void setPoseX(int poseX) {
        this.poseX = poseX;
    }

    public int getPoseY() {
        return poseY;
    }

    public void setPoseY(int poseY) {
        this.poseY = poseY;
    }

    public int getHEALTH() {
        return HEALTH;
    }

    public void setHEALTH(int HEALTH) {
        this.HEALTH = HEALTH;
    }

    public int getDAMAGE() {
        return DAMAGE;
    }

    public void setDAMAGE(int DAMAGE) {
        this.DAMAGE = DAMAGE;
    }
}
