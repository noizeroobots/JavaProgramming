package IntegerDemoInteractiveWithName.Part2;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void arithmeticDemo() {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        firstNumber = input.nextInt();
        System.out.println("Please enter another integer: ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        System.out.println(firstNumber + " + " + secondNumber + " equals " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " equals " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " equals " + average);
    }
}
