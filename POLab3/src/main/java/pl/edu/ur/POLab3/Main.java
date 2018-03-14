/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    
    
    public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
        int x = 11;
        if (x < 10 && x > 1) {
            System.out.println("OK");
        }

        if (x < 111 & x > 1) {
            System.out.println("Yup");
        }
        int i = 12;
        if (i == 12 | i > 10) {
            System.out.println("tes");//// It will check if i == 12 and it will check if i > 10
        }
        if (i == 12 || i > 10) {
            System.out.println("tak"); //It will check if i == 12, it does, so it stops checking and executes what is in the if statement
        }
        System.out.println(1001|0110);
        int a = 5;
int b = 3;
//int c = a+b++;
int d =(a++)+b;
System.out.println(d);
*/
            Scanner sc = new Scanner(System.in);
            System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
            int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
            System.out.println(liczba + "! = " + silnia(liczba));
            int petla=1;
            for(int i=1;i<=liczba;i++)
            {
              petla*=i;
            }
        System.out.println(petla);

}
}

// TODO 1.4, 1.7, 
// TODO 2.2
// TODO 3.3, 3.4

