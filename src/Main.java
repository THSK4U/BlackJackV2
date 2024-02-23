import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.handle();
    }

    public void handle() {
        Croupier croupier = new Croupier();
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Play  2. Sold");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                croupier.HitStand();
                break;
            case 2:
                System.out.println("Soon...");
                handle();
                break;
            default:
                System.out.println("Invalid choice.");
                handle();
                break;
        }
    }
}
