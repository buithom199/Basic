package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class DungForDuyetTheoDoiTuong {

	public static void main(String[] args) {
		// Khai báo List Interface có tên là listString
		// Kiểu dữ liệu là String
	List<String> listString = new LinkedList<String>();
	
	//Khai báo một Iterator;
	Iterator iterator = null;
	
	//Thêm các phần tử
	listString.add("One");
	listString.add("Two");
	listString.add("Three");
	listString.add("Four");
	
	System.out.println("Các phần tử có trong listString là:");
	
	//Lấy ra đối tượng iterator để truy cập vào các phần tử của tập hợp
	//Đối tượng iterator này chỉ chứa các String
	//Lúc này iterator sẽ trỏ vào
	//Chỉ số trước chỉ số của phần tử đầu tiên trong listString
	iterator = (Iterator) listString.iterator();
	
	//Kiểm tra xem Iterator còn phần tử tiếp hay không?
	//Nếu có thì sẽ di chuyển vị trí mà iterator
	//Đang trỏ vào sang vị trí của phần kế tiếp
	//Và hiển thị phần tử đó ra
	while( iterator.hasNext()) {
		System.out.println(iterator.next());
	}


	}

}
