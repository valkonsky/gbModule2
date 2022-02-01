package ru.gb.savilin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Competition {
    List<Obstacle> competition;
    List <Participant> team;
    List<Participant> loosers;


    Competition(Obstacle[] obstacles, Participant[] participants){
        competition= Arrays.asList(obstacles);
        team = Arrays.asList(participants);
        loosers = new ArrayList<Participant>();
    }
}
