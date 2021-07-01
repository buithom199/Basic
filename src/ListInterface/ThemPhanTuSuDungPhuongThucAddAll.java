package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ThemPhanTuSuDungPhuongThucAddAll {

	public static void main(String[] args) {
		//Khai báo một List Interface có tên là listWord
		//listWord có kiểu là String
		List<String> listWord = new ArrayList<String>();
		listWord.add("Apple");
		listWord.add("Banana");
		listWord.add("Orange");
		
		//Khai báo List Interface có tên là listString
		//kiểu dữ liệu là String
		List<String> listString = new ArrayList<String>();
		listString.add("Lemon");
		listString.add("Grape");
		
		//Thêm các phần tử của listWord
		//Vào cuối của listString
		listString.addAll(listWord);
		
		System.out.println("Các phần tử có trong listString là");
		for(String str : listString) {
		System.out.println(str);
		}
	}

}
