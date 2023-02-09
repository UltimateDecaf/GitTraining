import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm using Git!");
        sayHello();
        printAge();
    }

    public static void sayHello(){
        System.out.print("What is your name? >> ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, " + keyboard.nextLine() + "!");
    }

    public static void printAge(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How old are you? >> ");
        System.out.println("You are " + keyboard.nextInt() + " years old!");
    }

}
