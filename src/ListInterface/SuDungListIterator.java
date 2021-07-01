package ListInterface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SuDungListIterator {

	public static void main(String[] args) {
		//Khai báo List Interface có tên là listString
		//Kiểu dữ liệu là String
		List<String> listString = new LinkedList<String>();
		
		//Khai báo ListIterator
		ListIterator<String> listIterator = null;
		
		//Thêm các phần tử
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		
		//Lấy ra đối tượng listIterator để truy cập vào các phần tử của tập hợp
		//Đối lượng listIterator này chỉ chứ các String
		//Lúc này listIterator sẽ trỏ vào
		//Chỉ số trước chỉ số của phần tử đầu tiên trong listString
		listIterator = listString.listIterator();
		
		System.out.println("Các phần tử có trong listString là");
		
		//Kiểm tra xem ListIterator còn phần tử tiếp theo hay không?
		//Nếu có thì di chuyển vị trí mà listIterator
		//đang trỏ vào sang vị trí của phần tử kế tiếp
		//Và hiển thị phần tử đó ra
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}

	}

}
