package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {
	
	static int bolum=0;

	public static void main(String[] args) {
	// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
	//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfeb b�l�necek say�y� griniz");
	int b�l�nen =scan.nextInt();
	System.out.println("l�tfen b�len say�y� griniz");
int b�len=scan.nextInt();
		
		
		bol(b�l�nen, b�len);
	System.out.println(bolum);
	
	}

	public static int bol(int bol�nen ,int b�len) {
		while (bol�nen>=b�len) {
			bol�nen-=b�len;
			bolum++;
		}
		
		
		
		
		
		return bolum;
		
		
		
		
	}
	
	
	
	
	
}


