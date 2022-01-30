package ru.gb.savilin;

public class Cat implements Creaturable{
    private final int MAX_RUN;
    private final int MAX_JUMP;
    private boolean isFail;

    Cat(int MAX_JUMP, int MAX_RUN){
        this.MAX_JUMP = MAX_JUMP;
        this.MAX_RUN = MAX_RUN;
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
        return MAX_JUMP;
    }

    @Override
    public int getMaxRun() {
        return MAX_RUN;
    }

    @Override
    public boolean getIsFail() {
        return isFail;
    }

    @Override
    public void setIsFail(boolean fail) {
        this.isFail = fail;
    }


}
