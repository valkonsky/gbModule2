package ru.gb.savilin;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        System.out.println();
        String[][] elements = {{"12", "22", "1","111"},
                                {"32", "34", "34","3"},
                                {"6", "5", "55","77"},
                                {"26", "192", "1","1"}};
        ArrayManager.checkArraySize(elements);
        ArrayManager.sumAllElements(elements);
    }
}
