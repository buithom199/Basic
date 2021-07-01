package ListInterface;

import java.util.LinkedList;
import java.util.List;

public class PhuongThucGetTruyCap1PhanTuBatKy {

	public static void main(String[] args) {
		// Khai báo List Interface có tên là listString
		// Kiểu dữ liệu là String
		List<String> listString = new LinkedList<String>();
		
		//Thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		
		//Khai báo một List Interface có tên là listInteger
		//listWord có kiểu dữ liệu là Integer
		List<Integer> listInteger = new LinkedList<Integer>();
		
		//Thêm các phần tử
		listInteger.add(1);
		listInteger.add(8);
		listInteger.add(0);
		listInteger.add(32);
		listInteger.add(3);
		listInteger.add(12);
		
		//Truy cập phần tử có chỉ số 2 trong listString
		//tương ứng với chuỗi "Three"
		//Vì listString có kiểu là String
		//Nên các phần tử con của nó cũng có kiểu dữ liệu là String
		System.out.println("Phần tử có chỉ số 2 trong listString là");
		String str = listString.get(2);
		System.out.println(str);
		
		//Truy cập phần tử có chỉ số 4 trong listInteger
		//Tương ứng với số 3
		System.out.print("\nPhần tử có chỉ số 4 trong listInteger là");
		int number = listInteger.get(4);
		System.out.println(number);
		
		

	}

}
