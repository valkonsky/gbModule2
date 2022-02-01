package ru.gb.savilin;

public class Cat implements Participant {
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



    Cat(int maxJump, int maxRun){
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        isFail = false;
    }


    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public void jump() {
        System.out.println("cat jump");
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
