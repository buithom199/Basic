package LinkedList;

import java.util.LinkedList;

public class PhuongThucAddAll {

	public static void main(String[] args) {
		//Khai báo 1 danh sách liên kết đơn có tên là linkedListExitsts
		//có kiểu là String
		LinkedList<String> linkedListExists = new LinkedList<>();
		linkedListExists.add("Monday");
		linkedListExists.add("Tuesday");
		linkedListExists.add("Wednesday");
		linkedListExists.add("Thurday");
		
		//Khai báo 1 danh sách liên kết đơn có tên là linkedList
		//có kiểu là String
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Firday");
		linkedList.add("Sturday");
		linkedList.add("Sunday");
		
		//Thêm các phần tử của linkedList
		//vào cuối của linkedListExists
		linkedListExists.addAll(linkedList);
		
		System.out.println("Các phần tử có trong linkedListExists là");
		System.out.print(linkedListExists);
	}

}
