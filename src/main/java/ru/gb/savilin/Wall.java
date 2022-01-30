package ru.gb.savilin;

public class Wall implements Letable{

    private int height;

    Wall(int height){
        this.height = height;
    }

    @Override
    public void overcome(Creaturable creaturable) {
        if ((creaturable.getMaxJump()>= height)&&(creaturable.getIsFail()==false)){
            System.out.println("Wall completed ");
        }else if((creaturable.getMaxJump()>= height)&&(creaturable.getIsFail()==true)){
                System.out.println("disqualified");
        }else{
            System.out.println("did not cross the TreadMill:");
            creaturable.setIsFail(true);
        }
    }
}
