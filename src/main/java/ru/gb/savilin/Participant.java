package ru.gb.savilin;

public interface Participant {

    void run();
    void jump();
    int getMaxJump();
    int getMaxRun();
    boolean getFail();
    void setFail(boolean fail);

}
