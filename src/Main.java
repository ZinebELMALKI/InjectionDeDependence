import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Scanner scanner = new Scanner(new File("Config.txt"));
        String line = scanner.nextLine();
        Class<?> typepaiment = Class.forName(line);
        Paiment obj = (Paiment) typepaiment.newInstance();


        Commande commande = new Commande(obj);
        commande.effctuerPaiment();

    }
}
