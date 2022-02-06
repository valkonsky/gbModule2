package ru.gb.savilin;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        String[][] elements = {{"12", "22", "1","111"},
                                {"32", "34", "34","3"},
                                {"6", "5", "55","77"},
                                {"26", "192", "1","1"}};

        try {
            try {
                ArrayManager.sumAllElements4x4Array(elements);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
                System.err.println("Array does not have a valid size");
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.err.println("Array does not have a valid value(s)");
        }
    }
}
