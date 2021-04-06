package IntegerDemoInteractiveWithName.Part2;

import javax.swing.JOptionPane;

public class HelloNameDialog {

    public void hello() {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
    }
}
