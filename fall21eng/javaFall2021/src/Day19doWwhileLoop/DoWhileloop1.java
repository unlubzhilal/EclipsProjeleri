package Day19doWwhileLoop;

public class DoWhileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		  int i=0;
	        
	        while(i<5) {
	            System.out.print(i + " "); // 0 1 2 3 4 
	            i++;
	        }
	        
	        // while loop once kontrol eder sonra kodu calistirir
	        // loop icinde artis yapilsa da bir sonraki kontrole kadar kod calismaya devam eder
	        // bu da bazi durumlarda hatali sonuclara ulasmamiza sebep OLABILIR
	        
	        
	        
	        // do-while loop ise once islemi yapar ve sonra sarti kontrol eder
	        // ozellikle kullanicidan deger almalarda do while loop tercih edilir
	        int a=0;
	        do {
	            System.out.print(a + " ");
	            a++;
	        }while(a<5); //

          
	        int b=0;
	        
	        while (b<5) {
				System.out.print(b);
			b++;
	        }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
