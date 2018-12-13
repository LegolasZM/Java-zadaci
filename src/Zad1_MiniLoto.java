import java.util.Random;
import java.util.Scanner;

public class Zad1_MiniLoto {

    public static void main(String[] args) {
        boolean opet=true;

        System.out.println("Dobrodosli u Mini Loto.");

        while (opet) {

            System.out.println("Unesite jedan ceo broj izmedju 1 i 50:");
            Scanner ulaz1 = new Scanner(System.in);
            int izabran = ulaz1.nextInt();

            int slucajan = generateRandomIntIntRange(1,50);
            System.out.println("Izvucen je broj:" + slucajan);

            int razlika = slucajan - izabran;

            switch (Math.abs(razlika)) {

                case 0:
                    System.out.println("Neverovatno! Pogodili ste tacan broj! Savet: odigrajte Loto.");
                    break;

                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("Dobar pokušaj, bili ste jako blizu!");
                    break;

                default:
                    System.out.println("Više srece sledeci put...");
            }

            System.out.println("\n" + "Da li zelite opet da pogadjate broj (d/n):");
            Scanner ulaz2 = new Scanner(System.in);
            String odgovor = ulaz2.nextLine();

            if (!odgovor.equals("d")) {
                System.out.println("\n" + "Hvala sto ste igrali.");
                opet=false;
                ulaz1.close();
                ulaz2.close();
            }
        }
        System.exit(0);
    }

    private static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
