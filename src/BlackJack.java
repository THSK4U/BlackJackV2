public class BlackJack {
    public static void CroupierTour() {
        while (Hand.getValeurmaintotalcro() < 17) {
            Hand.AjouterCartCroupir();
        }
        DeterminerResultat();
        Main.handle();
    }

    public static void JoueurTour() {
        Hand.AjouterCart();
    }

    public static void DeterminerResultat() {
        System.out.println("Votre main : " + Hand.getValeurMaintotal() + " || Main du croupier : " + Hand.getValeurmaintotalcro());
        if (Hand.getValeurMaintotal() > 21 && Hand.getValeurmaintotalcro() < 21) {
            System.out.println("******** Vous avez dépassé 21 :( *******");
            System.out.println("******** Croupier gagné *******");
        } else if (Hand.getValeurmaintotalcro() > 21 && Hand.getValeurMaintotal() < 21 ) {
            System.out.println("******** Croupier dépassé 21 XD *******");
            System.out.println("******** Vous avez gagné *******");
        } else if (Hand.getValeurMaintotal() > Hand.getValeurmaintotalcro() && Hand.getValeurMaintotal() < 21) {
            System.out.println("------- Joueur a gagné -------");
        } else if (Hand.getValeurmaintotalcro() > Hand.getValeurMaintotal() && Hand.getValeurmaintotalcro() < 21) {
            System.out.println("------- Croupier a gagné -------");
        } else{
            System.out.println("------ Match nul -----");
        }

        Hand.setValeurMaintotal(0);
        Hand.setValeurmaintotalcro(0);
        Hand.setValeurmaintotal(0);

    }
}
