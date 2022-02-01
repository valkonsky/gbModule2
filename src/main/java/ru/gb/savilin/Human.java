package ru.gb.savilin;

public class Human implements Participant {

    private final int maxRun;
    private final int maxJump;
    private boolean isFail;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Human(int maxJump, int maxRun){
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        isFail = false;
    }

    @Override
    public void run() {
        System.out.println("human run");
    }

    @Override
    public void jump() {
        System.out.println("human jump");
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public boolean getFail() {
        return isFail;
    }

    @Override
    public void setFail(boolean fail) {
        this.isFail = fail;
    }
}
