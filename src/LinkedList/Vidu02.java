package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Vidu02 {

	public static void main(String[] args) {
		int n, node;
		LinkedList<Integer> linkedList = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số phần tử cần thêm");
		n= scanner.nextInt();
		
		//Nhập phần tử
		for(int i =0; i<n; i++) {
			System.out.println("Nhạp phần tử thứ" + i + ":");
			node = scanner.nextInt();
			linkedList.add(node);
		}
		
		System.out.println("Danh sách ban đầu");
		for(int i = 0; i<n; i++) {
			System.out.println(linkedList.get(i) + "\t");
		}
		
		//Đảo ngược các phần tử trong danh sách
		//Bàng cách sử dụng Collections.reverse()
		System.out.println("\nDanh sách sau khi đảo ngược là:");
		Collections.reverse(linkedList);
		for(int i =0; i<n; i++) {
			System.out.print(linkedList.get(i) + "\t");
		}

	}

}
