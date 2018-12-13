import java.util.Scanner;

public class Zadatak24NoviDigitron {

    public static void main(String[] args) {

        boolean opet=true;

        System.out.println("Dobrodosli u Novi Digitron.");

        while (opet) {

            Scanner ulaz1 = new Scanner(System.in);

            System.out.println("Unesite prvi ceo broj:");
            int izabran1 = ulaz1.nextInt();

            System.out.println("Unesite drugi ceo broj:");
            int izabran2 = ulaz1.nextInt();

            System.out.println("\n" + "Unesite koju operaciju zelite da izvrsite? ");
            System.out.println("s – sabiranje, o – oduzimanje, m – množenje, d – delenje");
            Scanner ulaz2 = new Scanner(System.in);
            String odgovor1 = ulaz2.nextLine();

            if (odgovor1.equals("s")) {
                int sab=sabiranje(izabran1,izabran2);
                System.out.println("Izabrali ste sabiranje. Rezultat je:" + sab);
            }

            if (odgovor1.equals("o")) {
                int odu=oduzimanje(izabran1,izabran2);
                System.out.println("Izabrali ste oduzimanje. Rezultat je:" + odu);
            }

            if (odgovor1.equals("m")) {
                int mno=mnozenje(izabran1,izabran2);
                System.out.println("Izabrali ste mnozenje. Rezultat je:" + mno);
            }

            if (odgovor1.equals("d")) {

                if (izabran2==0){
                    System.out.println("Delenje nulom nije moguce");
                }
                else {
                    double del = delenje(izabran1,izabran2);
                    System.out.println("Izabrali ste delenje. Rezultat je:" + del);
                }
            }

            System.out.println("\n" + "Da li zelite opet da racunate (d/n):");
            Scanner ulaz3 = new Scanner(System.in);
            String odgovor2 = ulaz3.nextLine();

            if (!odgovor2.equals("d")) {
                System.out.println("\n" + "Hvala sto ste koristili Digitron.");
                opet=false;

                ulaz1.close();
                ulaz2.close();
                ulaz3.close();
            }

        }// kraj while

        System.exit(0);
    }//kraj static main

    private static int sabiranje(int br1, int br2){
        int sab;
        return sab=br1+br2;
    }

    private static int oduzimanje(int br1, int br2){
        int odu;
        return odu=br1-br2;
    }

    private static int mnozenje(int br1, int br2){
        int mno;
        return mno=br1*br2;
    }

    private static double delenje(double br1, double br2){
        double del;
        return del=br1/br2;
    }

}//kraj public class z24
