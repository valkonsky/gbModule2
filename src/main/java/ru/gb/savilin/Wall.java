package ru.gb.savilin;

public class Wall implements Obstacle {

    private int height;

    Wall(int height){
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        if ((participant.getMaxJump()>= height)&&(participant.getFail()==false)){
            System.out.println("Wall completed ");
        }else if((participant.getMaxJump()>= height)&&(participant.getFail()==true)){
                System.out.println("disqualified");
        }else{
            System.out.println("did not cross the TreadMill:");
            participant.setFail(true);
        }
    }
}
