package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz

  Scanner scan = new Scanner(System.in);
  System.out.println("l�tfen veri gir");
	String veri=scan.next();
	int index=0;
	
	do {
	if (index%2==1) {
		System.out.print(veri.charAt(index)+" ");
	}
	index++;
	
		
		
	} while (index<veri.length());
	
	
	
	
	
	
	
	
	
	
	
	}

}
