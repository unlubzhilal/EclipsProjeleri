package nestedfor_whileloop;

import java.util.Scanner;

public class loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan 10'dan pozitif k���k bir tamsayi t�rencin
				// girdigi sayiya gore asagidaki sekli yazdirin
				// orn : 3 girlik
				// 1
				// 1 2
				// 1 2 3
	
	Scanner scan =new Scanner (System.in);
	System.out.println("10dan k���k say� giniz");
	int say�=scan.nextInt();
	
	for (int i = 1; i <= say�; i++) {
		
	for (int j = 1; j <= i; j++) {
		System.out.print(j);
	}
	System.out.println();
	}
	
	
	
	
	
	
	
	
	
	}

}
