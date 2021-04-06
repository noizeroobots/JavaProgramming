package IntegerDemoInteractiveWithName.Part2;

import javax.swing.JOptionPane;

public class AirlineDialog {
    public static void airlineDialog() {
        int selection;
        boolean isYes;
        selection = JOptionPane.showConfirmDialog(null,
                "Do you want to upgrade to first class?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,
                "You responded: " + isYes);
    }

    public static void arilineDialogTwoButtons() {
        int selection;
        selection = JOptionPane.showConfirmDialog(null,
                "A data input error has occurred. Continue?",
                "Data input error",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
    }
}
//prompt - запрос, подсказка