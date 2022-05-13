package Domaci_27_4;

//Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Funkcija y je definisana kao:
//        (x,       x < 2
//        y =  (2,      2 <= x < 10
//        (x - 1, x >= 10



import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite x: ");
        int x = sc.nextInt();
        if ( x < 2  ) {
            System.out.println("y = " + x);
        }
         if (2 <= x && x < 10) {
        System.out.println("Y = 2");

        } if ( x >= 10) {
        System.out.println("y = " + ( x - 1));

        }


    }
}
