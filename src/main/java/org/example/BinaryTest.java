package org.example;

public class BinaryTest {

    public static int[] DecimalToBinary (int decimalNumber){
        if (decimalNumber == 0) {
            return new int[]{0};
        }

        int[] temp = new int[32];
        int counter = 0;

        for (int i = decimalNumber; i>0; i = i/2) {
        temp[counter] = i%2;
        counter++;
        }
        int[] reversed = new int[counter];

        for (int i = counter-1, j = 0; i >=0; i--, j++) {
            reversed[j] = temp[i];
        }

        return reversed;
    }

    public static int ArrayToNumber(int [] arrayToCovert){

        StringBuilder result = new StringBuilder();
        for(int x : arrayToCovert){
            result.append(x);
        }

        return Integer.parseInt(result.toString());
    }

    //* works only for any positive numbers
    private static int powerOf(int number, int power){
        int result = number;
        if(power == 0){
            return 1;
        }
        for (int i = 1; i < power; i++) {
            result = result * number;
        }
        return result;
    }

    private static int[] numberToArray (int number){

        int[] temp = new int[32];
        int reminder = 0;
        int counter = 0;

        for (int i = 0; i <= number; i++) {
            reminder = number%2;
            temp[i] = reminder;
            number = number/10;
            if(number < 10){
                temp[i+1] = number%2;
            }
            counter++;
        }

        int[] reversedResult = new int[counter+1];

        for(int i = counter, j = 0; i >= 0; i--, j++){
            reversedResult[j] = temp[i];
        }

        return reversedResult;
    }

    public static int BinaryToDecimal (int binaryNumber){

        int[] arrayedNumber = numberToArray(binaryNumber);
        int sequence = arrayedNumber.length-1;
        int result = 0;

        for (int i = 0; i < arrayedNumber.length-1; i++) {
            if(arrayedNumber[i] != 0) {
                result += arrayedNumber[i] * powerOf(2, sequence);
                sequence--;
            }else {
                sequence--;
            }
        }
        return result;
    }

}
