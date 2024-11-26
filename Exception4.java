package pac;
import java.util.Scanner;
public class Exception4 {

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
        } finally {
            System.out.println("спасибо за внимание.");
        }
    }

    public static void main(String[] args) {
        Exception4 demo = new Exception4();
        demo.exceptionDemo();
    }
}
// теперь в конце каждой проверки будут писать спасибо за внимание.
// например 1-Result of 2 / i: 2 спасибо за внимание.