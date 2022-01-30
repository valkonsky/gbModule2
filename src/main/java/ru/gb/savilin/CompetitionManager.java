package ru.gb.savilin;

public class CompetitionManager {

    static void beginCompetition(Letable[] letables, Creaturable[] creaturables){
        for (int i=0;i<letables.length;i++){
            for (int j = 0;j<creaturables.length;j++){
                letables[i].overcome(creaturables[j]);
            }
        }
    }
}
