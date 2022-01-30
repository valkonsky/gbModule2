package ru.gb.savilin;

public class Robot implements Creaturable{

    private final int MAX_RUN;
    private final int MAX_JUMP;
    private boolean isFail;

    Robot(int MAX_JUMP, int MAX_RUN){
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
        System.out.println("robot run");
    }

    @Override
    public void jump() {
        System.out.println("robot jump");
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
