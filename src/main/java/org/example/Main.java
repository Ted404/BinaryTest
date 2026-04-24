package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int decimalInput = 255;
        int binaryInput = 1100100;

        // Test Decimal to Binary
        int[] binaryArray = BinaryTest.decimalToBinary(decimalInput);
        System.out.println("Input in decimal: " + decimalInput);
        System.out.println("Result in binary (Array): " + Arrays.toString(binaryArray));

        // Test Bitwise Decimal to Binary
        int[] bitwiseArray = BinaryTest.decimalToBinaryBitwise(decimalInput);
        System.out.println("Result in binary (Bitwise): " + Arrays.toString(bitwiseArray));

        System.out.println("----------------");

        // Test Binary to Decimal
        System.out.println("Input in binary: " + binaryInput);
        int decimalResult = BinaryTest.binaryToDecimal(binaryInput);
        System.out.println("Result in decimal: " + decimalResult);

        // Test Off-by-one fix (Binary 11 should be 3)
        int smallBinary = 11;
        System.out.println("Input small binary: " + smallBinary);
        System.out.println("Result in decimal (Should be 3): " + BinaryTest.binaryToDecimal(smallBinary));

        System.out.println("----------------");
        
        // Test ArrayToNumber
        int[] arr = new int[]{0, 0, 1, 1};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Array to Number: " + BinaryTest.arrayToNumber(arr));
    }
}
