package IntegerDemoInteractiveWithName.Part2;

import javax.swing.JOptionPane;

public class SalaryDialog {

    public static void salaryDialog() {
        String wageString;
        String dependentString;
        double wage;
        double weeklyPay;
        int dependents;
        final double HOURS_IN_WEEK = 37.5;

        wageString = JOptionPane.showInputDialog(null,
                "Enter employee's hourly wage",
                "Salary dialog 1",
                JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
        dependentString = JOptionPane.showInputDialog(null,
                "How many dependents?",
                "Salary dialog 2",
                JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentString);
        JOptionPane.showInternalMessageDialog(null,
                "Weekly salary is $"
                        + weeklyPay + "\nDeductions will be made for "
                        + dependents + " dependents.");
    }
}