package ru.gb.savilin;

public class CompetitionManager {

    static void beginCompetition(Obstacle[] obstacles, Participant[] participants){
        for (int i = 0; i< obstacles.length; i++){
            for (int j = 0; j< participants.length; j++){
                obstacles[i].overcome(participants[j]);
            }
        }
    }
}
