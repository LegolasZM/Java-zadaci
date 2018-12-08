import java.util.Scanner;

public class Zadatak21 {

    public static void main(String[] args){

        boolean opet=true;

        System.out.println("Dobrodosli u Parne brojeve.");

        while (opet) {

            Scanner ulaz1 = new Scanner(System.in);

            System.out.println("\n" + "Unesite prvi ceo broj (donju granicu):");
            int izabran1 = ulaz1.nextInt();

            System.out.println("\n" + "Unesite drugi ceo broj (gornju granicu):");
            int izabran2 = ulaz1.nextInt();

            int j=0;
            for (int i = izabran1; i<izabran2+1; i=i+1){

                if (i%2==0){
                    System.out.println("Paran broj je:" + i);
                    j=j+1;
                }
            }

            if (j==0){
                System.out.println("Nema parnih brojeva izmedju unetih brojeva");
            }

            System.out.println("\n" + "Da li zelite da unesete nove brojeve/granice (d/n):");
            Scanner ulaz2 = new Scanner(System.in);
            String odgovor = ulaz2.nextLine();

            if (!odgovor.equals("d")) {
                System.out.println("\n" + "Hvala sto ste koristili Parne brojeve.");

                opet=false;
                ulaz1.close();
                ulaz2.close();
            }

        }

        System.exit(0);
        }
}
