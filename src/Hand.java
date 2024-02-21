public class Hand {
    private static int ValeurMaintotal;

    public static void setValeurMaintotal(int ValeurMaintotal) {
        Hand.ValeurMaintotal = ValeurMaintotal;
    }

    public static void setValeurmaintotalcro(int valeurmaintotalcro) {
        Hand.valeurmaintotalcro = valeurmaintotalcro;
    }

    public static void setValeurmaintotal(int valeurmaintotal) {
        Hand.valeurmaintotal = valeurmaintotal;
    }

    private static int valeurmaintotal;
    private static int valeurmaintotalcro;

    public static int getValeurmaintotalcro() {
        return valeurmaintotalcro;
    }
    public static int getValeurMaintotal() {
        return ValeurMaintotal;
    }

    public static void hand() {
        Cartes.cartes();

    }
    public static void  AjouterCart() {
        int i = 3;
        PaquetCartes paquetCartes = new PaquetCartes();
        Carte randomCard = paquetCartes.getRandomCard();
        int randomcart = randomCard.getValeur();

        valeurmaintotal += randomcart;
        ValeurMaintotal = Cartes.getValeurmain()+ valeurmaintotal;

if (ValeurMaintotal > 21) {
    System.out.println("La valeur totale de la main : " + ValeurMaintotal);
    System.out.println(" carte " + i++ + " : " + randomCard.getForme() + " number " + randomcart);
    BlackJack.CroupierTour();
    BlackJack.DeterminerResultat();
    Main.handle();
}else if (ValeurMaintotal < 21) {
    System.out.println("La valeur totale de la main : " + ValeurMaintotal);
    System.out.println(" carte " + i++ + " : " + randomCard.getForme() + " number " + randomcart);
}else {
    BlackJack.DeterminerResultat();

}
    }
    public static void AjouterCartCroupir() {
        int i = 1;
        PaquetCartes paquetCartes = new PaquetCartes();
        Carte randomCardcro = paquetCartes.getRandomCardcro();
        int randomcartcro = randomCardcro.getValeur();

        valeurmaintotalcro += randomcartcro;
        ValeurMaintotal = Cartes.getValeurmain()+ valeurmaintotal;

        System.out.println("La valeur totale de la main du croupier : " + getValeurmaintotalcro());
        System.out.println(" carte " + i++ + " : " + randomCardcro.getForme() + " number " + randomcartcro);

    }
}