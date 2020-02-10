package MavenCalculator.Sample;

import java.util.Scanner;

public class Kiss {
	public static double operation(double a , int c , double b) {
		double n[] = {a+b,a-b,a*b,a/b} ;
		return n[c-1] ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble() ;
       
        int op = sc.nextInt();
        double b = sc.nextDouble();
        System.out.println(operation(a,op,b)) ;
	}

}
