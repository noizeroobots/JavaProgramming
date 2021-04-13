package IntegerDemoInteractiveWithName.Part2;

import java.util.Scanner;

public class ArithmeticDemo2 {

    public static void arithmeticDemo() {
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a double: ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double: ");
        secondNumber = input.nextDouble();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        System.out.println(firstNumber + " + " + secondNumber + " equals " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " equals " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " equals " + average);
    }
}
