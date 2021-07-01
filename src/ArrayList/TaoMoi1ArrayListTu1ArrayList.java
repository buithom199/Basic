package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TaoMoi1ArrayListTu1ArrayList {

	public static void main(String[] args) {
		int n; //Số phần tử của ArrayList
		int number;
		ArrayList<Integer> arrayListInteger =new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số phần tử của arraylist");
		n = scanner.nextInt();
		
		for(int i =0; i<n; i++) {
			System.out.println("Nhập phần tử thứ" + i + ":");
			number = scanner.nextInt();
			arrayListInteger.add(number);
		}
		
		//Tạo 1 ArrayList mới
		//Có số phần tử bằng với số phần tử của arraylist
		ArrayList<Integer> arrNewList = new ArrayList<>(arrayListInteger.size());
		
		//Duyệt các phần tử trong arrListInteger
		//nếu có phần tử nào trong arrListInteger tồn tại trong arrNewList
		//thì không thêm vào trong arrNewList
		//Ngược lại thì thêm vào bình thường
		for(int str: arrayListInteger) {
			if(!arrNewList.contains(str)) {
				arrNewList.add(str);
			}
		}
		
		System.out.print("Các phần tử có trong arrListInteger là:");
		System.out.println(arrayListInteger);
		System.out.print("Các phần tử có trong arrNewList là:");
		System.out.println(arrNewList);
	}

}
