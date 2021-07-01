package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ThemPhanTuVaoListDaTonTai {

	public static void main(String[] args) {
		// Khai báo một List Interface có tên là listWord
		// listWord có kiểu là String
		List<String> listWord = new ArrayList<String>();
		listWord.add("Apple");
		listWord.add("Banana");
		listWord.add("Orange");
		
		//Khai báo List Interface có tên là listString
		//Kiểu dữ liệu là String
		List<String> listString = new ArrayList<String>();
		listString.add("Lemon");
		listString.add("Grape");
		
		//Thêm các phần tử của listWord
		//Vào vị trí số của listString
		listString.addAll(1, listWord);
		
		System.out.println("Các phần tử có trong listString là");
		for(String str : listString) {
			System.out.println(str);
			
		}
		

	}

}
