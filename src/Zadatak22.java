import java.util.Scanner;

    public class Zadatak22 {

        public static void main(String[] args) {

            System.out.println("Dobrodosli u Najbolji Student.");

            System.out.println("Unesite ceo broj studenata za upis:");
            Scanner ulaz1 = new Scanner(System.in);
            int upisano = ulaz1.nextInt();

            String maxi = "";
            int maxp=0;
            Scanner ulaz2 = new Scanner(System.in);
            Scanner ulaz3 = new Scanner(System.in);

            for (int i=1; i<upisano+1; i=i+1){
                System.out.println("Unesite ime studenta za upis:");
                String ime = ulaz2.nextLine();

                System.out.println("Unesite ceo broj osvojenih poena za " + ime + ":");
                int poeni = ulaz3.nextInt();

                if (poeni>maxp){
                    maxp=poeni;
                    maxi=ime;
                }//kraj if

            }// kraj for

            ulaz1.close();
            ulaz2.close();
            ulaz3.close();

            System.out.println("Najbolji student je: " + maxi);
            System.out.println("Osvojen broj poena: " + maxp);

            System.exit(0);
        }//kraj void

    }// kraj public class