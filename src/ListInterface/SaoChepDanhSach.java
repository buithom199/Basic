package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaoChepDanhSach {

	public static void main(String[] args) {
		// Danh sách nguồn
		List<String> listSource = new ArrayList<String>();
		
		listSource.add("A");
		listSource.add("B");
		listSource.add("C");
		listSource.add("C");
		listSource.add("D");
		
		//Danh sách đích
		//Số phần tử của listDest phải lớn hơn hoặc bằng với số phần tử của listSource
		List<String> listDest =  new ArrayList<String>();
		
		listDest.add("V");
		listDest.add("W");
		listDest.add("X");
		listDest.add("Y");
		listDest.add("Z");
		
		//Sao chép các phần tử của listSource
		//Vào trong listDest
		Collections.copy(listDest, listSource);
		
		System.out.println("Các phần tử có trong listDest:");
		for(String str: listDest) {
			System.out.println(str);
		}
		


	}

}
