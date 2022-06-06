package pl.lublin.wsei.java.cwiczenia;

public class algorytm {

    public static void main(String[]args){
        System.out.println(("argument\tlog2(arg)\tsum(arg)\n"));


        int pow = 1;

                for (int x = 1; x<=5; x++){
                    pow = pow * 2;
                    System.out.printf("%d\t%f\t%d\t\n", pow, Math.log(pow), pow-1);
                }
    }
}