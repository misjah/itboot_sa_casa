package Domaci_27_4;

import java.util.Scanner;

// Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature (operator je string i moze imati vrednosti +, - , *, /) racuna
// i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.



public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();
        System.out.print("Unesite operator: ");
        String operacija = sc.next();

        if (operacija.equals("+")){
            System.out.println("Rezultat je: " + (a + b) );
        } if (operacija.equals("-")){
            System.out.println("Rezultat je: " + (a - b) );
        } if (operacija.equals("*") || operacija.equals("x")){
            System.out.println("Rezultat je: " + (a * b) );
        } if (operacija.equals("/")){
            System.out.println("Rezultat je: " + (a / b) );

        }




    }
}
