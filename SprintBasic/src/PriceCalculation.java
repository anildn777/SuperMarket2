import java.util.ArrayList;
import java.util.Scanner;


public class PriceCalculation {

    Scanner scanner = new Scanner(System.in);


    public void addition() {

        int counter = 0;

        System.out.println("Bitte den Preis des ersten Produkts eingeben: ");
        double price1 = scanner.nextDouble();
        counter++;
        System.out.println("Bitte den Preis des zweiten Produkts eingeben: ");
        double price2 = scanner.nextDouble();
        counter++;
        System.out.println("Bitte den Preis des dritten Produkts eingeben: ");
        double price3 = scanner.nextDouble();
        counter++;
        System.out.println("Bitte den Preis des vierten Produkts eingeben: ");
        double price4 = scanner.nextDouble();
        counter++;
        System.out.println("Bitte den Preis des fünften Produkts eingeben: ");
        double price5 = scanner.nextDouble();
        counter++;


        double sum = price1 + price2 + price3 + price4 + price5;
        double vAT = sum / 1.19;
        System.out.println("Gesamtpreis: " + sum + " €");
        System.out.println("Preis nach Mehrwertsteuer in Euro: " + vAT + " €");
        System.out.println("Produktmenge: " + counter + " Stück");
    }
}
