import java.util.Random;
import java.util.Scanner;

public class Zadatak23UpgradeMiniLoto {

    public static void main(String[] args) {
        boolean opet = true;

        System.out.println("Dobrodosli u Mini Loto.");

        while (opet) {

            System.out.println("\n" + "Unesite jedan ceo broj izmedju 1 i 50:");
            Scanner ulaz1 = new Scanner(System.in);
            int izabran = ulaz1.nextInt();

            int slucajan = generateRandomIntIntRange(1, 50);

            int rezultat = blizinapogotka(izabran,slucajan);

            if (rezultat==0){
                System.out.println("Izvucen je broj:" + slucajan);
                System.out.println("Neverovatno! Pogodili ste tacan broj! Savet: odigrajte Loto.");
            }

            if (rezultat==1){
                System.out.println("Izvucen je broj:" + slucajan);
                System.out.println("Dobar pokušaj, bili ste jako blizu!");
            }

            if (rezultat==2){
                System.out.println("Izvucen je broj:" + slucajan);
                System.out.println("Probajte ponovo da pogodite broj.");
                opet = true;
            }

            if (rezultat==0 || rezultat==1) {

                System.out.println("\n" + "Da li zelite opet da pogadjate broj (d/n):");
                Scanner ulaz2 = new Scanner(System.in);
                String odgovor = ulaz2.nextLine();

                if (!odgovor.equals("d")) {
                    System.out.println("\n" + "Hvala sto ste igrali.");
                    opet = false;
                    ulaz1.close();
                    ulaz2.close();
                }
            }//kraj if

        }//kraj while
        System.exit(0);
    }//kraj main

    private static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static int blizinapogotka(int izb, int slu){

        int razlika = slu - izb;
        int blizina;
        switch (Math.abs(razlika)) {

            case 0:
                return blizina=0;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return blizina=1;

            default:
                return blizina=2;

        }//kraj switch
    }//kraj blizina

}//kraj public
