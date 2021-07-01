package LinkedList;

import java.awt.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class SudungLisIterator {

	public static void main(String[] args) {
		// Khai báo 1 danh sách liên kết đơn có tên là linkedList
		// có kiểu Float
		LinkedList<Float> linkedList = new LinkedList<>();
		
		linkedList.add(6.35f);
		linkedList.add(1.0f);
		linkedList.add(10.24f);
		linkedList.add(20.17f);
		
		ListIterator<Float> listIterator = linkedList.listIterator();
		
		//Hiển thị các phần tử có trong linkedList
		//bằng cách sử dụng ListIterator
		System.out.println("Duyệt xuôi (từ đầu cuối danh sách):");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next() + "\t");
		}
		
		System.out.println("\nDuyệt ngược (từ cuối trở về đầu danh sách): ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous() + "\t");
		}

	}

}
