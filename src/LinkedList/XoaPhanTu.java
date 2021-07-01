package LinkedList;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Khai báo 1 danh sách liên kết
		//Có kiểu là String
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Six");
		linkedList.add("Five");
		linkedList.add("Three");
		linkedList.add("One");
		linkedList.add("Six");
		
		//Tạo bản sao của linkedList sử dụng phương thức clone()
		//lúc này linkedListCopy1 và linkedListCopy2 sẽ có các phần tử của linkedList
		LinkedList<String> linkedListCopy1 = (LinkedList<String>) linkedList.clone();
		LinkedList<String> linkedListCopy2 = (LinkedList<String>) linkedList.clone();
		
		//tạo 1 list Interface
		List<String> listString = new LinkedList<>();
		listString.add("Two");
		listString.add("Five");
		listString.add("Four");
		
		//xóa phần tử đầu tiên và cuối cùng trong linkedList
		//sử dụng phương thức removeFirst() và removeLast()
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("Các phần tử có trong linkedList sau khi xóa" + linkedList);
		
		//Xóa phần tử có chỉ số 2 trong linkedListCopy1
		//sử dụng phương thức remove()
		//phần tử có chỉ số 2 là "Three"
		linkedListCopy1.remove(2);
		System.out.println("Các phần tử có trong linkedListCop1 sau khi xóa:"
				+ linkedListCopy1);
		
		//xóa những phần tử có trong linkedListCopy2 mà cũng có trong listString 
		//sử dụng phương thức remove()
		linkedListCopy2.removeAll(listString);
		System.out.println("Các phần tử có trong linkedListCopy2 sau khi xóa:" 
				+ linkedListCopy2);

	}

}
