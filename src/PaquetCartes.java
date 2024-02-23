import java.util.*;
import java.sql.*;
class Carte implements IPaquetCartes {
    private String forme;
    private int valeur;

    public Carte(String forme, int valeur) {
        this.forme = forme;
        this.valeur = valeur;
    }
    @Override
    public String getForme() {
        return forme;
    }
    @Override
    public int getValeur() {
        return valeur;
    }
}

public class PaquetCartes {

    private List<Carte> cartes;

    public PaquetCartes() {
        cartes = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BLACK", "root", "TAHAtaha");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM black.carte");
            while (rs.next()) {
                String couleur_carte = rs.getString("couleur_carte");
                int valeur_carte = rs.getInt("valeur_carte");
                Carte carte = new Carte(couleur_carte, valeur_carte);
                cartes.add(carte);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("An error occurred: " + e.getMessage());
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