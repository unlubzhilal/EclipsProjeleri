package day22Arrays;

import java.util.Arrays;

public class SplitArray1 {

	public static void main(String[] args) {
		//"java �grendim,  &cok para ?kazand�m.,"

	// c�mlesinin kelimelerini noktalama ve �zel karakterler olmadan 
	//	harf s�ras�na g�re yazd�ral�m 
		
	String cumle="java �grendim,  &cok para ?kazand�m.,";
	
	String yeni[]=cumle.split(" ");
	System.out.println(Arrays.toString(yeni));
	
	for (int i = 0; i < yeni.length; i++) {
		
	yeni[i]=yeni[i].replaceAll("\\W", "");
	System.out.println(yeni[i]);
	
	}
	
	System.out.println(Arrays.toString(yeni));
	
	Arrays.sort(yeni);
	System.out.println(Arrays.toString(yeni));
	
	for (int i = 0; i < yeni.length; i++) {
		System.out.print(yeni[i]+" ");
	}
	
	
	
	
	
	
	
	}

}
