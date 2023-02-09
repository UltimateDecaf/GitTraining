import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm using Git!");
        sayHello();
    }

    public static void sayHello(){
        System.out.print("What is your name? >> ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, " + keyboard.nextLine() + "!");
    }
}
