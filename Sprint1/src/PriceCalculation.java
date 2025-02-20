import java.util.ArrayList;
import java.util.Scanner;

public class PriceCalculation {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> price = new ArrayList<Double>();
    String[] productQuantity = {"ersten", "zweiten", "dritten", "vierten", "fünften"};


    public void addition() {

        double sum = 0;

        for (int i = 0; i < productQuantity.length; i++) {
            System.out.println("Füg den Preis des " + productQuantity[i] + " Produkts hinzu: ");
            price.add(scanner.nextDouble());
            sum += price.get(i);

        }

        double vAT = sum / 1.19;
        System.out.println("Gesamtpreis: " + sum + " €");
        System.out.println("Preis nach Mehrwertsteuer in Euro: " + vAT + " €");
        System.out.println("Produktmenge: " + price.size() + " Stück");
    }
}
