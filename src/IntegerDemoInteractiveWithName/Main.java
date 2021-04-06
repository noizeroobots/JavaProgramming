package IntegerDemoInteractiveWithName;

import IntegerDemoInteractiveWithName.Part2.AirlineDialog;
import IntegerDemoInteractiveWithName.Part2.SalaryDialog;

public class Main {

    @SuppressWarnings("checkstyle:RegexpSingleline")
    public static void main(final String[] args) {

//        HelloNameDialog helloNameDialog = new HelloNameDialog();
//        helloNameDialog.hello();

//        SalaryDialog salaryDialog = new SalaryDialog();
//        salaryDialog.salaryDialog();
/* ключевое слово static означает, что
метод доступен и может использоваться,
даже если никаких объектов класса не существует.
 */
//        SalaryDialog.salaryDialog();
        AirlineDialog.airlineDialog();

    }
}
