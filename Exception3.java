package pac;
import java.util.Scanner;
public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("Result of 2 / i: " + (2 / i));
            // не будет работать программа если это в начало поставить поскольку по правилам исключения должны идти от более
            //специфичных к более общим иначе
            //Exception 'java. lang. ArithmeticException' has already been caught
            //Так что я впишу exception в конец catch листа
        } catch (NumberFormatException e) {
            System.out.println("not an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero.");
        } catch (Exception e) {
            System.out.println("общее исключение");
        }
    }

    public static void main(String[] args) {
        Exception3 demo = new Exception3();
        demo.exceptionDemo();
    }
}
//Qwerty- not an integer.
//0-Attempted division by zero.
//not an integer.
//1 -все нормально
