package day25arraylistremove;

import java.util.Arrays;
import java.util.List;

public class ListeCevirmeArraysaslist {

	public static void main(String[] args) {
		//Verilen array� Arrays clas�ndan ayrd�m alarak l�ste ceviririz
		
		String arr[]= {"3","5","7","3"};
   List<String>arraydanliste=Arrays.asList(arr);
System.out.println(arraydanliste);
	
	
	// arraydan list olana add. ekleme yapamay�z 
	
	
	arr[1]="z";
	System.out.println(arraydanliste); // array de�i�irse liste de�i�iyor
	
	
	arraydanliste.set(0, "r");
	System.out.println(arraydanliste);
	System.out.println(Arrays.toString(arr));
	
	int arr1[]= {1,2,3,4,5,6,7,8,9};
	
	
	
			
	
	
	
	
	
	}

}
