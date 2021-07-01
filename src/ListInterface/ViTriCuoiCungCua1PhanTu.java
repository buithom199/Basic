package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ViTriCuoiCungCua1PhanTu {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		listString.add("Five");
		
		//Tìm kiếm vị trí xuất hiện cuối cùng
		// của phần tử "Three" trong listString
		int lastIndex = listString.lastIndexOf("Three");
		System.out.println("Chỉ số xuất hiện cuối cùng của phần tử Three = " + lastIndex);

	}

}
