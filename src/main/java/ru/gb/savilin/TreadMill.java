package ru.gb.savilin;

public class TreadMill implements Letable{
    private int lenght;

    TreadMill(int lenght){
        this.lenght = lenght;
    }
    @Override
    public void overcome(Creaturable creaturable) {
        if ((creaturable.getMaxRun()>= lenght)&&(creaturable.getIsFail()==false)){
            System.out.println("TreadMill completed ");
        }else if((creaturable.getMaxRun()>= lenght)&&(creaturable.getIsFail()==true)){
            System.out.println("disqualified");
        }else{
            System.out.println("did not cross the TreadMill:");
            creaturable.setIsFail(true);
        }
    }
}
