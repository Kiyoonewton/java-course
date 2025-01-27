package Game;

import java.util.Scanner;

public class madlib {

    public static void main(String[] args) {

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (descriptive): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (name): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter another adjective (descriptive): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb ending with 'ing' (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter another adjective (descriptive): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to the " + adjective1 + " zoo");
        System.out.println("In an exihibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();
    }

}
