package Domaci_27_4;

import java.util.Scanner;

//Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//        Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke
//T1 i T2 su pozicije login forme. M je pozicija na kojoj je kliknuto

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("T1 - Unesite x: ");
        int t1x = sc.nextInt();
        System.out.print("T1 - Unesite y: ");
        int t1y = sc.nextInt();
        System.out.print("T2 - Unesite x: ");
        int t2x = sc.nextInt();
        System.out.print("T2 - Unesite y: ");
        int t2y = sc.nextInt();
        System.out.print("M - Unesite x: ");
        int Mx = sc.nextInt();
        System.out.print("M - Unesite y: ");
        int My = sc.nextInt();

        if (Mx > t1x && My < t2x && My > t1y && My < t2y ){


        System.out.println("kliknuto u okviru!");

        }else {
            System.out.println("nije kliknuto u okviru prozora.");
        }

    }
}
