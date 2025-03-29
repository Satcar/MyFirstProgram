import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        hello(name);
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
    }
}