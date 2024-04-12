import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("How Old Are you:  ");
        int age = scanner.nextInt();

        System.out.println("What is your favorit food?  ");
        String food = scanner.next();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorit food is " + food + ".");
        scanner.close();
    }
}
