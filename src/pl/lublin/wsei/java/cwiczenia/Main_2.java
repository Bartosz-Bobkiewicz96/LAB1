package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;
//Bartosz Bobkiewicz//
public class Main_2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Podaj pierwszą liczbę: ");
        num1 = input.nextInt();
        System.out.print("Podaj pierwszą liczbę: ");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n", num1,num2,num1+num2);


    }

}