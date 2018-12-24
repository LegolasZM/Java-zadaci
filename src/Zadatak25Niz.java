import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Zadatak25Niz {

    public static void main(String[] args) {

        boolean opet=true;

        System.out.println("Dobrodosli u Niz.");

        while (opet) {
            System.out.println("Unesite duzinu niza (ceo broj):");
            Scanner ulaz1 = new Scanner(System.in);
            Scanner ulaz2 = new Scanner(System.in);
            Scanner ulaz3 = new Scanner(System.in);

            int duzina = ulaz1.nextInt();

            int[] niz1;
            int[] niz2;

            niz1 = new int[duzina];
            niz2 = new int[duzina];

            for (int i=0; i<niz1.length; i++){

                System.out.println("Unesite " + (i+1) + " clan niza (ceo broj):");
                niz1[i] = ulaz3.nextInt();

            }//kraj for

            niz2 = sortiranje (niz1);

            System.out.println("Sortiran niz:");

            for (int i:niz2){

                System.out.print(i);
                System.out.print(", ");
            }//kraj for

            int slucajan=generateRandom(1, 1000);

            boolean clanniza=clan(slucajan, niz2);

            if (clanniza){

                System.out.println("\n" + "Broj " + slucajan + " je clan niza.");
            } else {
                System.out.println("\n" + "Broj " + slucajan + " nije clan niza.");
            }

            System.out.println("Prvih pet clanova niza:");
            for (int i=0; i<5; i++){

                System.out.print(niz2[i]);
                System.out.print(", ");
            }


            System.out.println("\n" + "Da li zelite opet da pogadjate broj (d/n):");
            String odgovor = ulaz2.nextLine();

            if (!odgovor.equals("d")) {
                System.out.println("\n" + "Hvala sto ste igrali.");
                opet=false;
                ulaz1.close();
                ulaz2.close();
                ulaz3.close();
            }

        }//kraj while



    } //kraj void main


    private static int[] sortiranje(int[] arr){

        for (int i = 0; i < arr.length -1; i++){
            int index = i;
            for (int j= i+1; j< arr.length; j++){
                if(arr[j] < arr[index])
                    index = j;

                int manji = arr[index];
                arr[index] = arr[i];
                arr[i] = manji;
            }//kraj for2

        }//kraj for 1

        return arr;
    }//kraj sortiranje

    private static int generateRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt(max)+1;
    }


    private static boolean clan(int r, int[] arr){
        boolean potvrda = false;

        for (int i=0; i<arr.length; i++){
            if (Objects.equals(r, arr[i])) {
                potvrda = true;
            }

        }//kraj for

        return potvrda;
    }//kraj clan

}//kraj public class z25
