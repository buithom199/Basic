package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXepCacPhanTu {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		
		listString.add("F");
		listString.add("B");
		listString.add("D");
		listString.add("C");
		listString.add("G");
		listString.add("A");
		
		//Sắp xếp các phần tử trong listString
		//Sử dụng phương thức Collection().sort();
		Collections.sort(listString);
		
		System.out.println("Các phần tử trong listString sau khi sắp xếp");
		for(String str: listString) {
			System.out.println(str);
		}

	}

}
