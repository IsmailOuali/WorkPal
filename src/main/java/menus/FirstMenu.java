package menus;
import java.util.Scanner;

public class FirstMenu {


    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("╔═════════════════════════╗");
        System.out.println("║       Role Menu         ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Member Menu          ║");
        System.out.println("║─────────────────────────║");
        System.out.println("║ 2. Manager Menu         ║");
        System.out.println("║─────────────────────────║");
        System.out.println("║ 3. Admin Menu           ║");
        System.out.println("╚═════════════════════════╝");
        System.out.println("Your selection is: ");

        int selectedChoice = sc.nextInt();
    }


}
