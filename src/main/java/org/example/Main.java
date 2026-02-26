package org.example;


public class Main {
    public static void main(String[] args) {

        int DecimalInput = 255;
        int BinaryInput = 1100100;

        int [] a = BinaryTest.DecimalToBinary(DecimalInput);
        System.out.println("Input in decimal: " + DecimalInput);

        System.out.print("Result in binary: " );
        for(int y : a){
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("----------------");

        System.out.print("Input in binary: " + BinaryInput);
        System.out.println();
        System.out.print("Result in decimal: ");
        int b = BinaryTest.BinaryToDecimal(1100100);
        System.out.println(b);

        System.out.println();
        int[] arr = new int[]{0,0,1,1};
        System.out.println(BinaryTest.ArrayToNumber(arr));
    }
}