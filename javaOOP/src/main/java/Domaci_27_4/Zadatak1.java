package Domaci_27_4;

import java.util.Scanner;

//Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//        -	b=1, vrednost promenljive a se uvecava za 10
//        -	b=2, vrednost promenljive a se smanjuje za 20
//        Na kraju zadatka odstampati novu vrednost promenljive a.
//        Primer izvrsenja:
//        Unesite a: 44
//        Unesite b: 2
//        Nova vrednost za a je 24


public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();

        if (b == 1){
            System.out.print("Nova vrednost je: " + (a + 10));
        } if (b == 2){
            System.out.println("Nova vrednost je: " + (a - 20));


        }


    }
}
