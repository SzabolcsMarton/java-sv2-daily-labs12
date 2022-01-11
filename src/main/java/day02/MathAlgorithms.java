package day02;

public class MathAlgorithms {

    public int getHighestCommonDivisors(int firstNumber, int secondNumber) {
        int result = 1;
        for (int i = 2; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public int getHighestCommonDivisorsWhile(int firstNumber, int secondNumber) {

        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }
        return firstNumber;
    }
}