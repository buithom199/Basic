package MangMotChieu;

import java.util.Scanner;

public class ThaoTacTrenMang {

	public static void main(String[] args) {
		int n, sum =0, temSort;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào số phần tử của mảng:");
			n = scanner.nextInt();
		}while(n<0);
		
		//Khởi tạo và cấp phát bộ nhớ cho mảng
		int array[] = new int[n];
		
		System.out.println("Nhập các phần tử của mảng:");
		for(int i = 0; i<n;i++) {
			System.out.println("Nhập phần tử thứ"+i+":");
			array[i] = scanner.nextInt();
		}
		//Hiển thị mảng vừa nhập
		System.out.println("\nMang ban đầu");
		for(int i = 0; i< n; i++) {
			System.out.println(array[i]+ "\t");
		}
		
		//tính tổng các phần tử có trong mảng
		for(int i =0; i< n; i++) {
			sum += array[i];
		}
		System.out.println("\nTong các phần tử có trong mảng=" + sum);
		
		//Sắp xếp theo thứ tự giảm dần
		for(int i =0; i< n-1; i++) {
			for(int j= i+1; j<= n-1; j++) {
				if(array[1] <array[j]) {
					temSort = array[i];
					array[i] = array[j];
					array[j] = temSort;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp");
		for(int i =0; i<n; i++) {
			System.out.print(array[i] + "\t");
		}
		
		//Tìm phần tử nhỏ nhất
		//Sau khi sắp xếp theo thứ tự giảm dần
		//Thì phần tử nhỏ nhất là phần tử cuối cùng trong tháng
		System.out.println("Phần tử nhỏ nhất trong mảng là" + array[n-1]);

	}

}
