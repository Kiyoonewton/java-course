import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is: " + name);
        System.out.println("You are age: " + age + " years old.");
        
        scanner.close();
    }
}
