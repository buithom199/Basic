package ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimKiemTrucTiepPhanTu {

	public static void main(String[] args) {
		// Khai báo List Interface có tên là listString
		// kiểu dữ liệu là String
		List<String> listString = new ArrayList<String>();
		
		//Thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Three");
		listString.add("Four");
		listString.add("Five");
		listString.add("Two");
		
		//tìm kiếm phần tử "Six" trong danh sách
		if(listString.contains("Six")) {
			System.out.println("Không có phần tử Six trong listString");
		}else {
			System.out.println("Không tìm thấy phần tử Six");
		}

	}

}
