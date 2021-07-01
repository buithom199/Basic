package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class SuDungIterator {

	public static void main(String[] args) {
		// Khai báo 1 danh sách liên kết đơn có tên là linkedList
		//có kiểu là String
		LinkedList<String> linkedList = new LinkedList<>();
		
		//thêm các phần tử
		//sử dụng phương thức add()
		linkedList.add("Rose");
		linkedList.add("Lavender");
		linkedList.add("Orchid");
		linkedList.add("Lily");
		// khai báo một Iterator có kiểu là String
	    Iterator<String> iterator = linkedList.iterator();
	     
	    // hiển thị các phần tử có trong linkedList
	    // bằng cách sử dụng Iterator
	    System.out.println("Các phần tử có trong linkedList là: ");
	    while (iterator.hasNext()) {
	        System.out.print(iterator.next() + "\t");
	    }
	}

}
