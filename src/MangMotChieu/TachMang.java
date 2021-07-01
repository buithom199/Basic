package MangMotChieu;

import java.util.Scanner;

public class TachMang {

	public static void main(String[] args) {
		int n;
		int c = 0; //Số phần tử của mảng thứ nhất
		int d = 0; //Số phần tử của mảng thứ hai
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của mảng");
			n = scanner.nextInt();
		}while(n<0);
		int A[] = new int[n];
		int[] mangThuNhat = new int[n];
		int[] mangThuHai = new int[n];
		
		System.out.println("Nhập các phần tử cho mảng:");
		for(int i =0; i<n; i++) {
			System.out.println("Nhập phần tử thứ" + i + ":");
			A[i] = scanner.nextInt();
		}
		
		//duyệt vòng lặp for từ đầu đến giữa mảng
		for(int i=0; i<n/2;i++) {
			mangThuNhat[c] = A[i];
			c++;
		}
		
		//Duyệt vòng lặp for từ vị trí giữa mảng đến cuối mảng
		for(int i = n/2; i <n; i++) {
			mangThuHai[d] = A[i];
			d++;
		}
		System.out.println("Các phần tử của mảng thứ nhất là:");
		for(int i =0; i<c; i++) {
		System.out.print(mangThuNhat[i] + "\t");
		}
		
		System.out.println("Các phần tử của mảng thứ hai là:");
		for (int i = 0; i < d; i++) {
			System.out.print(mangThuHai[i] + "\t");
			
		}

	}

}
