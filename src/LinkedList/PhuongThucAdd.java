package LinkedList;

import java.util.LinkedList;

public class PhuongThucAdd {

	public static void main(String[] args) {
		//khai báo 1 danh sách liên kết đơn có tên là linkedList
		//có kiểu là Integer
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//Thêm 4 phàn tử (nút) có kiểu Integer
		linkedList.add(6);
		linkedList.add(1);
		linkedList.add(10);
		linkedList.add(20);
		
		System.out.println("Các phần tử có trong linkedList ban đầu");
		System.out.println(linkedList);
		
		//thêm phần tử có giá trị 56
		//vào vị trí số 3 trong linkedList
		
		linkedList.add(3, 56);
		
		//thêm 2 phần tử 4 và 6 vào đầu và cuối danh sách
		//sử dụng phương thức addFirst() và addLast()
		linkedList.addFirst(4);
		linkedList.addLast(6);
		
		//Sử dụng phương thức size() để đếm số phần tử trong danh sách
		System.out.println("Số phần tử có trong danh sách" + linkedList.size());
		
		System.out.println("Các phần tử có trong linkedList sau khi thêm");
		System.out.println(linkedList);
		

	}

}
