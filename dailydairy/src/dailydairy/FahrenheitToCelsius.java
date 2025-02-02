package dailydairy;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fah=sc.nextInt();
		int cel=(fah-32)*5/9;
		float c=(fah-32f)*5f/9f;
		float ci=(fah-32f)*5/9;
		double cis=(fah-32)*5/9;//int by int will become int so one of the value should in double
		double cil=(fah-32)*5.0/9;
		System.out.println(cel);
		System.out.println(c);
		System.out.println(ci);
		System.out.println(cis);
		System.out.println(cil);
		System.out.printf("%.4f",c); 
		

	}

}
