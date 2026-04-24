package org.example;

public class BinaryTest {

    public static int[] decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return new int[]{0};
        }

        int[] temp = new int[32];
        int counter = 0;

        for (int i = decimalNumber; i > 0; i = i / 2) {
            temp[counter] = i % 2;
            counter++;
        }
        int[] reversed = new int[counter];

        for (int i = counter - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = temp[i];
        }

        return reversed;
    }

    /**
     * Bitwise implementation of decimal to binary conversion.
     * This is the more standard way to handle binary in Java.
     */
    public static int[] decimalToBinaryBitwise(int decimalNumber) {
        if (decimalNumber == 0) return new int[]{0};
        
        // Calculate number of bits needed
        int bits = (int) (Math.log(decimalNumber) / Math.log(2)) + 1;
        int[] result = new int[bits];
        
        for (int i = bits - 1; i >= 0; i--) {
            result[i] = decimalNumber & 1; // Get the last bit
            decimalNumber >>= 1;          // Shift right by 1
        }
        return result;
    }

    public static int arrayToNumber(int[] arrayToConvert) {
        StringBuilder result = new StringBuilder();
        for (int x : arrayToConvert) {
            result.append(x);
        }
        // Using Long to handle larger bit strings before they overflow
        return Integer.parseInt(result.toString());
    }

    private static int powerOf(int number, int power) {
        if (power == 0) return 1;
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }

    private static int[] numberToArray(int number) {
        if (number == 0) return new int[]{0};

        int tempNumber = number;
        int length = 0;
        
        // Calculate length first
        while (tempNumber > 0) {
            tempNumber /= 10;
            length++;
        }

        int[] result = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }

        return result;
    }

    public static int binaryToDecimal(int binaryNumber) {
        int[] arrayedNumber = numberToArray(binaryNumber);
        int sequence = arrayedNumber.length - 1;
        int result = 0;

        // FIXED: Changed condition from arrayedNumber.length - 1 to arrayedNumber.length
        for (int i = 0; i < arrayedNumber.length; i++) {
            if (arrayedNumber[i] != 0) {
                result += arrayedNumber[i] * powerOf(2, sequence);
            }
            sequence--;
        }
        return result;
    }
}
