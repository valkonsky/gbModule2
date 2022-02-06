package ru.gb.savilin;

public class ArrayManager {

    private static String[][] checkArraySize(String[][] elems) throws MyArraySizeException {
        int counter = 0;
        for (int i=0;i<4;i++){
            if (elems[i].length==4){
                counter++;
            }
        }
        if ((elems.length==4)&&(counter==4)){
            return elems;
        }else{
            throw new MyArraySizeException();
        }
    }

    public static void sumAllElements4x4Array(String[][] elems) throws MyArrayDataException, MyArraySizeException {
        checkArraySize(elems);
        int result = 0;
        for (int i = 0; i < elems.length; i++) {
            for (int j = 0; j < elems[i].length; j++) {
                try{
                    result += Integer.parseInt(elems[i][j]);
            }catch (NumberFormatException e){
                  String message = "err in " + "[" + i+"]" + " "+ "["+ j + "]";
                    throw new MyArrayDataException(message);
                }
            }
        }
        System.out.println(result);
    }
}
