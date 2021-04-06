package IntegerDemoInteractiveWithName.Part2;

import javax.swing.JOptionPane;

public class HelloNameDialog {

    public static void hello() {
        String result;
        result = JOptionPane.showInputDialog(null,
                "What is your area code ?",
                "Area code information",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
    }
}
