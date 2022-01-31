package ru.gb.savilin;

public class TreadMill implements Obstacle {
    private int lenght;

    TreadMill(int lenght){
        this.lenght = lenght;
    }
    @Override
    public void overcome(Participant participant) {
        if ((participant.getMaxRun()>= lenght)&&(participant.getFail()==false)){
            System.out.println("TreadMill completed ");
        }else if((participant.getMaxRun()>= lenght)&&(participant.getFail()==true)){
            System.out.println("disqualified");
        }else{
            System.out.println("did not cross the TreadMill:");
            participant.setFail(true);
        }
    }
}
