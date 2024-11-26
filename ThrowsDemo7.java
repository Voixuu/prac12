package pac;
import java.util.Scanner;
public class ThrowsDemo7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a key: ");
        String key = myScanner.next();

        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("exception in getKey: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "Data for " + key;
    }
    public static void main(String[] args) {
        ThrowsDemo7 demo = new ThrowsDemo7();
        demo.getKey();
    }
}