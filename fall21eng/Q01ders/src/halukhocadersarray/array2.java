package halukhocadersarray;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {
		
		 //multidimensional arrayin i� array lerindeki t�m elemanlar�n toplam�n� birer birer bulan
        // ve herbir sonucu yeni bir arrayin eleman� yapan ve yeni array i ekrana yazd�ran program� yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

	int arr[][]= {{10,20,30}, {4}, {6,7,20}};
	
	int arr1[ ]= new int[arr.length];
	
	
	for (int i = 0; i < arr.length; i++) {
		
		
		for (int j = 0; j < arr[i].length; j++) {
			
		arr1[i]+=arr[i][j];
		
		
		}
		
		
		
		
	}
	System.out.println(Arrays.toString(arr1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
