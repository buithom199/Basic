package MangMotChieu;

import java.util.Scanner;

public class DemSoLanXuatHienTrongMang {

	public static void main(String[] args) {
		int n;
		//Biến đếm số phần tử được nhập từ bàn phím có trong mảng
		int count =0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhập vào số phần tử của mảng");
			n = scanner.nextInt();
		}while(n<0);
		
		int A[] = new int[n];
		System.out.println("Nhập số phần tử của mảng:");
		for(int i=0; i<n;i++) {
			System.out.println("Nhập phần tử thứ " + i + ":");
			A[i] = scanner.nextInt();
			}
		//Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím
		System.out.println("Nhập vào 1 số nguyên bất kỳ:");
		int number = scanner.nextInt();
		
		for(int i = 0; i<n; i++) {
			if (A[i] == number) {
				count++;
			}
		}
		System.out.println("Số phần tử" + number+ "có trong mảng = " + count);
		}
	

}
