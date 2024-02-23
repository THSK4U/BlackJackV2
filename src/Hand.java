public class Hand implements IHand{
    private static int ValeurMaintotal;
    private static int valeurmaintotal;
    private static int valeurmaintotalcro;
    @Override
    public void setValeurMaintotal(int ValeurMaintotal) {
        Hand.ValeurMaintotal = ValeurMaintotal;
    }

    @Override
    public void setValeurmaintotalcro(int valeurmaintotalcro) {
        Hand.valeurmaintotalcro = valeurmaintotalcro;
    }
    @Override
    public void setValeurmaintotal(int valeurmaintotal) {
        Hand.valeurmaintotal = valeurmaintotal;
    }

    public int getValeurmaintotalcro() {
        return valeurmaintotalcro;
    }
    public int getValeurMaintotal() {
        return ValeurMaintotal;
    }

    public void hand() {
        Cartes Cartes = new Cartes();
        Cartes.cartes();

    }
    public void  AjouterCart() {
        Cartes Cartes = new Cartes();
        int i = 3;
        PaquetCartes paquetCartes = new PaquetCartes();
        Carte randomCard = paquetCartes.getRandomCard();
        int randomcart = randomCard.getValeur();

        valeurmaintotal += randomcart;
        ValeurMaintotal = Cartes.getValeurmain()+ valeurmaintotal;

        Main Main = new Main();
        BlackJack blackJack = new BlackJack();

        if (ValeurMaintotal > 21) {
            System.out.println("La valeur totale de la main : " + ValeurMaintotal);
            System.out.println(" carte " + i++ + " : " + randomCard.getForme() + " number " + randomcart);
            blackJack.CroupierTour();
            blackJack.DeterminerResultat();
            Main.handle();
        }else if (ValeurMaintotal < 21) {
            System.out.println("La valeur totale de la main : " + ValeurMaintotal);
            System.out.println(" carte " + i++ + " : " + randomCard.getForme() + " number " + randomcart);
        }else if (ValeurMaintotal == 21) {
            blackJack.DeterminerResultat();

        }
    }
    public void AjouterCartCroupir() {
        Cartes Cartes = new Cartes();
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