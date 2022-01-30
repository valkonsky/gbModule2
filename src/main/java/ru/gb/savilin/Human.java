package ru.gb.savilin;

public class Human implements Creaturable{

    private final int MAX_RUN;
    private final int MAX_JUMP;
    private boolean isFail;

    Human(int MAX_JUMP, int MAX_RUN){
        this.MAX_JUMP = MAX_JUMP;
        this.MAX_RUN = MAX_RUN;
        isFail = false;
    }

    public int getMAX_JUMP(){
        return MAX_JUMP;
    }

    public int getMAX_RUN(){
        return MAX_RUN;
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
