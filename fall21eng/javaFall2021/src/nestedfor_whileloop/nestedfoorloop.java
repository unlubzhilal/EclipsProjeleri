package nestedfor_whileloop;

import java.util.Scanner;

public class nestedfoorloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// iki tamsay� al
		// ilk say�dan ba�layarak   ikinci say�ya  kadar 3 er 3 er yazd�r�n 
		// ikinci say� dahil olmak zorunda de�il
	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen iki say� griniz");
		int say�1=scan.nextInt();
	    int say�2=scan.nextInt();
	
	if (say�1>say�2) {
		
		for (int i = say�1; i >= say�2; i-=3) {
			System.out.print(i+" ");
		}
		
		
		
		
	} else if (say�1<say�2) {
		for (int i = say�1; i <= say�2; i+=3) {
			System.out.print(i+" ");
		}
		
	} else {
System.out.println("girilen say�lar es�ittir");
	}{

	}
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
