package pac;
public class Exception1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    //шаг 2 - выводит infinity операции с числами double не вызывают исключения при делении на 0.0, если число в таком случае положительно, то выводиться бесконечность, отрицательно -бесконечность
    public static void main(String[] args) {
        Exception1 demo = new Exception1();
        demo.exceptionDemo();
    }
    //шаг 3 -Attempted division by zero все работает как должно, try выполняет код деление на 0 лрвиться catch-ем(ArithmeticException) и выводиться Attempted division by zero
}