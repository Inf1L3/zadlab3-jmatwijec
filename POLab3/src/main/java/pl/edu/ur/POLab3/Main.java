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
        if (wartosc == 0) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }
    }

    public static int potegowanie_it(int podstawa, int potega) {
        int wartosc = 1;
        for (int i = 1; i <= potega; i++) {
            wartosc *= podstawa;
        }
        return wartosc;
    }
// z https://www.programiz.com/java-programming/examples/power-number-recursion

    public static int power(int base, int powerRaised) {
        if (powerRaised != 0) {
            return (base * power(base, powerRaised - 1));
        } else {
            return 1;
        }
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n > 1) {
            return fib(n - 1) + fib(n - 2);
        }
        return 1;
    }

    // TODO 1.4, 1.7, 
// TODO 2.2
// TODO 3.3, 3.4
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // zad 3.4
        System.out.println(fib(10));
        //zad 3.3
        /*
        System.out.println(potegowanie_it(2, 3));
        System.out.println(power(2, 3));
         */

        //zad 2.2  Zrodla glownie tutorialspoint, javapoint
        // Zamina stringa na tablice znakow https://www.javatpoint.com/java-string-tochararray
        /*
        String s1 = "hello";
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        //https://www.javatpoint.com/java-string-getbytes Zamina pojedynczych znakow na liczby a asci
        s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
        }
        // https://www.javatpoint.com/java-string-equals Porownuje stringi 
        s1 = "javatpoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOINT";
        String s4 = "python";
        System.out.println(s1.equals(s2));//true because content and case is same  
        System.out.println(s1.equals(s3));//false because case is not same  
        System.out.println(s1.equals(s4));//false because content is not same 
        //pornowuje bez znaczenie wielkosc liter
        System.out.println(s1.equalsIgnoreCase(s3)); //true
        String str_Sample = "RockStar";
        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
        //Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
        System.out.println(s1.indexOf("p"));//liczy od poczatku pozycje
        System.out.println(s1.lastIndexOf("p"));//liczy od konca pozyjce
        System.out.println(s1.substring(5)); // tworzy stringa od pozycji x
        System.out.println(s1.substring(5,7)); //to samo tylko od x do y
        System.out.println(s1.replace("j", "p")); // zamienia j na p;
        System.out.println(s1.trim()); //Zwraca kopię ciągu znaków z pominiętymi początkowymi i końcowymi spacji.
        System.out.println(s1.toLowerCase());//male znaki
        System.out.println(s1.toUpperCase()); // duze znaki
              String cos = new String("Welcome-to-Tutorialspoint.com");
      System.out.println("Return Value :" );      
      
      for (String retval: cos.split("-")) { //dzieli strnga 
         System.out.println(retval);
      }
            for (String retval: cos.split("-", 2)) { //dzielni stringa na x kawalkow
         System.out.println(retval);
      }//Dzieli ten ciąg wokół dopasowań danego wyrażenia regularnego.
        */
        // zad 1.7
                /*if (!(false)) {
            System.out.println("not");
        }
        if (true ^ false) {
            System.out.println("xor");
        }
        if (true ^ true) {
            System.out.println("xor tu nie dziala i gdy wystepuja 2 jedynki lub 2 zera");
        }
                 */ // 1.4 uwaga,trzeba miec java 7+ (liczby binarne)
                /*
        int a= 111; //3
        int i = 0b1111; //000 1111
        System.out.println(i);
        i=i>>3; // (0001)_2=1
        System.out.println(i);
        i=i<<3; //(0001)<< 1000=8
        System.out.println(i);
        i=0b10001;
        i=i>>>3; //010=2
        System.out.println(i);
                 */
    }
    /*
/* ZADANIA ROBIONE NA LKECJI
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
 /*
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
     */
}

// TODO 1.4, 1.7, 
// TODO 2.2
// TODO 3.3, 3.4

