package pl.lublin.wsei.java.cwiczenia.mylib;

import java.util.Random;

public class typytablicowe {
        public static void main(String[]args){

            int[]liczby = new int [30];
            Random rnd = new Random();

            for ( int i=0; i<30; i++)
                liczby[i] = rnd.nextInt();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            long avg = 0;

            for(int l : liczby){
                System.out.println(l);
                if (l<min)min = l;
                if (l>max)max = l;
                avg+=l;


            }
            System.out.printf("Min=%d, Max = %d, AVG = %f",min,max,(float)avg/liczby.length);
        }


}
