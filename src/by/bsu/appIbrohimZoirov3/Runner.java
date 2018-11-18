package by.bsu.appIbrohimZoirov3;

import java.util.Scanner;

public class Runner {
    public static void main( String[] args ) {
        double eps, s = 0, n = 1, s1 = 1, x, n1 = 2;
        int k;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k");
        k=in.nextInt();
        System.out.println("Введите x");
        x=in.nextDouble();
        eps=Math.pow(0.1,k);
        s+=s1;
        while(Math.abs(s1)>=eps){
            s1=s1*(-1)*n1*(n1-1)*(3-2*n)/n/n/4*x/(1-2*n);
            n1+=2;
            n++;
            s+=s1;
        }
        System.out.println("Приближенное: "+s);
        System.out.println("С помощью функции: "+Math.sqrt(1+x));
    }
}
