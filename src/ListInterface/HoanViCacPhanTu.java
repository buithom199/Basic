package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HoanViCacPhanTu {

	public static void main(String[] args) {
		// Tạo 1 listNumber có kiểu dữ liệu là Integer
		List<Integer> listNumber = new ArrayList<Integer>();
		for(int i =0; i<=10; i++) {
			listNumber.add(i);
		}
		System.out.println("Phần tử trong listNumber trước khi hoán vị:");
	//Hiển thị các phần tử trong listNumber ở dạng mảng
		System.out.println(listNumber);
		
		Collections.shuffle(listNumber);
		
		System.out.println("Các phần tử trong listNumber sau khi hoán vị:");
		System.out.println(listNumber);

	}

}
