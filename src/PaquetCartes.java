import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


class Carte {
    private String forme;
    private int valeur;

    public Carte(String forme, int valeur) {
        this.forme = forme;
        this.valeur = valeur;
    }

    public String getForme() {
        return forme;
    }

    public int getValeur() {
        return valeur;
    }
}


public class PaquetCartes {
    private List<Carte> cartes;

    public PaquetCartes() {
        cartes = new ArrayList<Carte>();
        for (String forme : new String[]{"carreau", "coure", "pique", "trefle"}) {
            for (int valeur : new int[]{1,2,3,4,5,6,7,8,9,10,10,10,10}) {
                cartes.add(new Carte(forme, valeur));
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(cartes);
    }

    public Carte getRandomCard() {
        return cartes.remove(new Random().nextInt(cartes.size()));
    }

    public Carte getRandomCardcro() {
        return cartes.remove(new Random().nextInt(cartes.size()));
    }
}


