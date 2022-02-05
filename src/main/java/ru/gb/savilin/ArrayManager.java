package ru.gb.savilin;

public class ArrayManager {

    public static void checkArraySize(String[][] elems) throws MyArraySizeException {
        int counter = 0;
        for (int i=0;i<4;i++){
            if (elems[i].length==4){
                counter++;
            }
        }
        if ((elems.length==4)&&(counter==4)){
            System.out.println("good");
        }else{
            throw new MyArraySizeException();
        }
    }

    public static void sumAllElements(String[][] elems) throws MyArrayDataException {
        int result = 0;
        for (int i = 0; i < elems.length; i++) {
            for (int j = 0; j < elems[i].length; j++) {
                try{
                    result += Integer.parseInt(elems[i][j]);
            }catch (NumberFormatException e){
                    System.out.println("err in " + "[" + i+"]" + " "+ "["+ j + "]");
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println(result);
    }
}
