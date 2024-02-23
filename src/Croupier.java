import java.util.Scanner;

public class Croupier {

    public void HitStand() {
        Hand Hand = new Hand();
        BlackJack blackJack = new BlackJack();
        Hand.hand();
        while (Hand.getValeurMaintotal() < 21) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Hit or 2. Stand");
            int choice = scanner.nextInt();
            if (choice == 1) {
                blackJack.JoueurTour();
            } else if (choice == 2) {
                blackJack.CroupierTour();
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}