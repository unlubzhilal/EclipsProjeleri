package halukhocadersarray;

import java.util.Arrays;

public class ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
	int arg []={2,6,4,5,8,9};
	
	int kare[]=new int[arg.length];
	for (int i = 0; i < arg.length; i++) {
		 kare[i]++;
		kare[i]=arg[i]*arg[i];
		
	}
	
	
	System.out.println(Arrays.toString(kare));
	
	
	
	
	}

}
