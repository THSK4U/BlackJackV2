public class Cartes implements ICartes {

    private static int Valeurmain;
    @Override
    public int getValeurmain(){

        return Valeurmain;
    }
    public void cartes() {
        PaquetCartes paquetCartes = new PaquetCartes();
        paquetCartes.shuffleCards();
        Carte randomCard1 = paquetCartes.getRandomCard();
        String cart1 =randomCard1.getForme();
        int cart1valeur =randomCard1.getValeur();
        Carte randomCard2 = paquetCartes.getRandomCard();
        String cart2 =randomCard2.getForme();
        int cart2valeur =randomCard2.getValeur();

        Valeurmain = randomCard1.getValeur() + randomCard2.getValeur();

        System.out.println("votre main =  " + Valeurmain);
        System.out.println(" carte 1 : " + cart1 + " number " + cart1valeur);
        System.out.println(" carte 2 : " + cart2 + " number " + cart2valeur);

    }

}