import java.util.Scanner;

public class Croupier {
    public static void HitStand() {
        Hand.hand();
        while (Hand.getValeurMaintotal() < 21) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Hit or 2. Stand");
            int choice = scanner.nextInt();
            if (choice == 1) {
                BlackJack.JoueurTour();
            } else if (choice == 2) {
                BlackJack.CroupierTour();
            } else {
                System.out.println("Invalid choice.");
                }
            }
        }
    }