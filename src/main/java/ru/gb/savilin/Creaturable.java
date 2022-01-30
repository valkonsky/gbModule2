package ru.gb.savilin;

public interface Creaturable {

    void run();
    void jump();
    int getMaxJump();
    int getMaxRun();
    boolean getIsFail();
    void setIsFail(boolean fail);

}
