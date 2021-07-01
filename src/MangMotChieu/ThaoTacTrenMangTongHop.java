package MangMotChieu;

import java.util.Arrays;
import java.util.Scanner;

public class ThaoTacTrenMangTongHop {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của mảng");
			n = scanner.nextInt();
		}while (n<0);
		
		int A[] = new int[n];
		
		System.out.println(" Nhập các phần tử cho mảng");
		for(int i =0; i<n; i++) {
			System.out.println("Nhập phần tử thứ" + i + ":");
			A[i] = scanner.nextInt();
		}
		//Xuất giá trị các phần tử của mảng
		System.out.println("\nMang ban đầu:");
		for(int i =0; i<n; i++) {
			System.out.print(A[i] + "\t");
		}
		
		//Tìm phần tử có giá trị lớn nhất, nhỏ nhất
		int max = A[0]; //Khởi tạo phần tử lớn nhất là phần tử đầu tiên
		int min = A[0]; //Khởi tạo phần tử bé nhấ là phần tử đầu tiên
		
		for(int i=0; i<n;i++) {
			if(A[i] < min) {
				min = A[i];
			}
			if(A[i] >max) {
				max = A[i];
			}
		}
		System.out.println("Phần tử lớn nhất trên mảng" + max);
		System.out.println("Phần tử bé nhất trên mảng" + min);
		
		//Đếm số phần tử là số chẵn
		int soPhanTuChan = 0;
		for(int i =0; i<n ; i++) {
			if(A[i] %2 ==0) {
				soPhanTuChan++;
			}
		}
		System.out.println("Số phần tử chẵn trong mảng " + soPhanTuChan);
		
		//Sắp xếp mảng tăng dần
		//Java cung cấp cho chúng ta một thư viện có sẵn
		//Để sắp xếp mảng, đó là thư viện sort của lớp Arrays
		//Mặc định thư viện này sẽ sắp xếp mảng tăng dần
		Arrays.sort(A);
		System.out.println("Mảng sau khi sắp xếp:");
		for(int i = 0; i<n; i++) {
			System.out.print(A[i] + "\t");
		}

	}

}
