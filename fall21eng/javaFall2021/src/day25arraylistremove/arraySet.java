package day25arraylistremove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {1,2,3};
	Arrays.binarySearch(arr, 0);
	
	System.out.println(Arrays.binarySearch(arr, 2));
	// verilen arraydan tekrar eden elemenetleri sadece birer tane yazarak un�g elemnetlerden bir aray haline getirelim 
	
	
	int arr1[]= {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5,20,60};

	List<Integer> tekrars�z=new ArrayList<>();
	
	for (int i = 0; i < arr1.length; i++) {
		if (!tekrars�z.contains(arr1[i])) {
			tekrars�z.add(arr1[i]);
		}
		
		
	}
	System.out.println(tekrars�z);
	
	int arr2[]= new int[tekrars�z.size()];
	System.out.println(Arrays.toString(arr2));
	for (int i = 0; i < tekrars�z.size(); i++) {
		arr2[i]=tekrars�z.get(i);
		
	}
	System.out.println(Arrays.toString(arr2));


	
	
	}

}
