import java.util.Scanner;

public class Zad2_Digitron {

    public static void main(String[] args) {

        boolean opet;
        opet=true;

        System.out.println("Dobrodosli u Digitron.");

        while (opet) {

            Scanner ulaz1 = new Scanner(System.in);

            System.out.println("Unesite prvi ceo broj:");
            int izabran1 = ulaz1.nextInt();

            System.out.println("Unesite drugi ceo broj:");
            int izabran2 = ulaz1.nextInt();

            System.out.println("\n" + "Unesite koju operaciju zelite da izvrsite? ");
            System.out.println("s – sabiranje, o – oduzimanje, m – množenje, d – deljenje");
            Scanner ulaz2 = new Scanner(System.in);
            String odgovor1 = ulaz2.nextLine();

            if (odgovor1.equals("s")) {
                int sab=izabran1+izabran2;
                System.out.println("Izabrali ste sabiranje. Rezultat je:" + sab);
            };

            if (odgovor1.equals("o")) {
                int odu=izabran1-izabran2;
                System.out.println("Izabrali ste oduzimanje. Rezultat je:" + odu);
            };

            if (odgovor1.equals("m")) {
                int mno=izabran1*izabran2;
                System.out.println("Izabrali ste sabiranje. Rezultat je:" + mno);
            };

            if (odgovor1.equals("d")) {
                int del=izabran1/izabran2;
                System.out.println("Izabrali ste sabiranje. Rezultat je:" + del);
            };

            System.out.println("\n" + "Da li zelite opet da racunate (d/n):");
            Scanner ulaz3 = new Scanner(System.in);
            String odgovor2 = ulaz3.nextLine();

            if (!odgovor2.equals("d")) {
                System.out.println("\n" + "Hvala sto ste koristili Digitron.");
                opet=false;
            };

        }

        System.exit(0);
    }
}
