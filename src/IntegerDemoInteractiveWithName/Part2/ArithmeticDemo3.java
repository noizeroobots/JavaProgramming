package IntegerDemoInteractiveWithName.Part2;

import java.util.Scanner;

public class ArithmeticDemo3 {

    public static void arithmeticDemo() {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;
        double average01;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer: ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) sum / 2;
        average01 = (double) (sum / 2);

        System.out.println(firstNumber + " + " + secondNumber + " equals " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " equals " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " equals " + average);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " equals " + average01);
    }
}
