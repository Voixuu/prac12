package pac;
import java.util.Scanner;
public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("Result of 2 / i: " + (2 / i));
        } catch (NumberFormatException e) {
            System.out.println("not an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        }
    }
    public static void main(String[] args) {
        Exception2 demo = new Exception2();
        demo.exceptionDemo();
    }
}
//Qwerty -строка не может быть преобразована в число Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
//0-деление на ноль для целых чисел невозможно. Exception in thread "main" java.lang.ArithmeticException: / by zero
//1.2-не целое число Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
//1-все отлично     Enter an integer: 1
//                  Result of 2 / i: 2



