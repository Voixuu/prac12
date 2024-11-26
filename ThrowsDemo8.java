package pac;

import java.util.Scanner;

public class ThrowsDemo8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Invalid key: " + e.getMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "Data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo8 demo = new ThrowsDemo8();
        demo.getKey();
    }
}