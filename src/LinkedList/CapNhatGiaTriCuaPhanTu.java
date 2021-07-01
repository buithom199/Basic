package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class CapNhatGiaTriCuaPhanTu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Khai báo 1 danh sách liên kết
		//có kiểu là String
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Android");
		linkedList.add("IOS");
		linkedList.add("Windowns Phone");
		
		System.out.println("Danh sách các phần tử trước khi thay đổi:");
		System.out.print(linkedList + "\t");
		
		System.out.println("\n Nhập vào chỉ số của phần tử cần thay đổi:");
		int index = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập vào giá trị cần thay đổi");
		String str = scanner.nextLine();
		
		//kiểm tra nếu chỉ số lơn hơn hoặc bằng 0
		//và nhỏ hơn kích thước của linkedList-1 thì mới cập nhật
		//ngược lại thông báo lỗi
		if((index < 0) || (index > (linkedList.size()-1))) {
			System.out.println("Chỉ số cần thay đổi phải lớn hơn 0 và nhỏ hơn" + (linkedList.size()-1));
		}else {
			String node = linkedList.set(index, String.valueOf(str));
		}
		
		System.out.println("Danh sách các phần tử sau khi thay đổi");
		System.out.print(linkedList + "\t");



	}

}
