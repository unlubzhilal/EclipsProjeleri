package day23;

public class Arraysoru�al��smas� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	oru 1 ) Asagidaki multi dimensional array�in tum elemanlarinin carpimini ekrana 
     //yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
	
	int arr[][]= { {1, 2}, {4, 5, 6, 7 } };
	
	
	System.out.println(arr[0][0]);
	System.out.println(arr[1][3]);
	
	int toplam�arp�m=1;
	for (int i = 0; i < arr.length; i++) {
		
	
	     for (int j = 0; j < arr[i].length; j++) {
		  toplam�arp�m*=arr[i][j];
	
	     }
	
	
	}
	System.out.println(toplam�arp�m);
	
	
	
	
	
	
	
	
	
	}

}
