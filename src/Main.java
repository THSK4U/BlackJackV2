import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/BLACK";
            String username = "root";
            String password = "TAHAtaha";

            Connection con = DriverManager.getConnection(url, username, password);
            handle();
        } catch (SQLException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void handle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Play  2. Sold");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                Croupier.HitStand();
                 break;
            case 2:
                System.out.println("Soon...");
                Main.handle();
                break;
            default:
                System.out.println("Invalid choice.");
                Main.handle();
                break;
        }
    }
    }

