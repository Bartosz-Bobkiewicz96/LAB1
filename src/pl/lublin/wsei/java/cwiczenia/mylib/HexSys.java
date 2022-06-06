package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Scanner;


public class HexSys {

    public static String leftPad(String aText, char aChar, int aWidth) {

        String res = aText;
        for (int i = 0; i<aWidth-aText.length();i++)
            res = aChar + res;
        return res;

    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int num_1;

        do {
            System.out.printf("Prosze o podanie pierwszej liczby: ");
            num_1 = input.nextInt();
            if (num_1 == 0) break;

            System.out.printf("Dzięstne liczba to: %d, Liczba dwójkowa:%s , liczba szesnastkowa: %s%n",num_1, Integer.toBinaryString(num_1),Integer.toHexString(num_1));

        } while(true);
    }
}
