import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File file = new File( "konverzijskiFaktor.txt");
        FileWriter writer = new FileWriter(file);

        System.out.println("Unesitne broj kilometara: ");
        double brKilometara = scanner.nextDouble();


        System.out.println("Unesite konverzijski faktor: ");
        double konverzijskiFaktor = scanner.nextDouble();

        writer.write(Double.toString(konverzijskiFaktor));
        writer.close();

        FileReader reader = new FileReader(file);
        char[] buffer = new char[30];
        reader.read(buffer);
        reader.close();
        String contents = new String(buffer);
        System.out.println(contents);

        System.out.println(contents.equals(konverzijskiFaktor));
        // Vraca false

        if (brKilometara < 0)
            System.out.println("Broj kilometara mora biti pozitivan broj");
        else if (konverzijskiFaktor < 0) {

            System.out.println("Konverzijski faktor mora biti pozitivan broj");
        } else {
            int rezultatKonverzije = (int) (brKilometara / konverzijskiFaktor);
            System.out.println("Uneseno je "+ brKilometara + " kilometara, što je " + rezultatKonverzije + " milja");
        }
    }



}



