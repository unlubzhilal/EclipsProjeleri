package day25arraylistremove;

import java.util.ArrayList;
import java.util.List;

public class listdevam {

	public static void main(String[] args) {
		// verilen bir listede i�inde belirli harf olan elamanlar� silen program metod  yaz�n�z 
		
		List<String>str=new ArrayList<>();
		
		str.add("ali");
		str.add("eli");
		str.add("turgut");
		str.add("fali");
		str.add("tu�ba");
		str.add("turgat");
System.out.println(str);
	String silinecekharf="a";
	
	str=kilThamAll( str , silinecekharf);
	
	}

	private static List<String> kilThamAll(List<String> str, String silinecekharf) {
		
		for (int i = 0; i <str.size(); i++) {
			if (str.get(i).contains("a")) {
				str.remove(i);
				i--;
			}
		}
		
		
		System.out.println(str);
		
		return str;
		
	}


	
	
	
	
	
	
}
