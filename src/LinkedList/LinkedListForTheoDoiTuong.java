package LinkedList;

import java.util.LinkedList;

public class LinkedListForTheoDoiTuong {

	public static void main(String[] args) {
		// Khai báo 1 danh sách liên kết đơn có tên là linkedList
		// có kiểu là Character
		LinkedList<Character> linkedList = new LinkedList<>();
		
		linkedList.add('j');
		linkedList.add('a');
		linkedList.add('v');
		linkedList.add('a');
		
		//hiển thị các phần tử có trong linkedList
		//bằng cách sử dụng vòng lặp for duyệt theo đối tượng
		//trong đó kiểu dữ liệu của biến node
		//phải trùng với kiểu dữ liệu của linkedList
		System.out.println("Các phần tử có trong linkedList là: ");
		for(char node: linkedList) {
			System.out.print(node + "\t");
		}

	}

}
