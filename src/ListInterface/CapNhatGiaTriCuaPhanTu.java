package ListInterface;


import java.util.ArrayList;
import java.util.List;


public class CapNhatGiaTriCuaPhanTu {

	public static void main(String[] args) {
		// Khai báo List Interface có tên là listString
		//kiểu dữ liệu là String
		List<String> listString = new ArrayList<String>();
		
		//Thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		listString.add("Five");
		
		//Xóa phần tử có chỉ số là 0
		listString.remove(0);
		System.out.println("Các phần tử của listString sau khi xóa");
		for(String str: listString) {
			System.out.println(str);
		}

	}

}
