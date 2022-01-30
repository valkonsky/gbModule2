package ru.gb.savilin;

public class Main {

    public static void main(String[] args) {

        Creaturable[] team = new Creaturable[]{
                new Cat(2,5),
                new Human(1,30),
                new Robot(0,15)
        };

        Letable[] obstacleСourse = new Letable[]{
                new Wall(1),
                new TreadMill(1)
        };

        CompetitionManager.beginCompetition(obstacleСourse,team);
    }
}
