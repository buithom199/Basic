package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ViTriDauTienCua1PhanTu {

	public static void main(String[] args) {
		// Khai báo List Interface có tên là listString
		// Kiểu dữ liệu là String
		List<String> listString = new ArrayList<String>();
		
		//Thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		listString.add("Five");
		listString.add("Three");
		
		//Tìm kiếm phần tử "Three" trong danh sách
		int firstIndex = listString.indexOf("Three");
		System.out.println("Chỉ số xuất hiện đầu tiên của phần tử Three = " + firstIndex);

	}

}
