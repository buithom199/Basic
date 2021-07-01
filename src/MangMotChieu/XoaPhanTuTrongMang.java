package MangMotChieu;

import java.util.Scanner;

public class XoaPhanTuTrongMang {

	public static void main(String[] args) {
		int n, i, c;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("NHập vào số phần tử của mảng");
			n = scanner.nextInt();
		}while(n <=0);
		
		int A[] = new int[n];
		
		System.out.println("Nhập các phần tử cho mảng:");
		for(i=0; i<n;i++) {
			System.out.println("Nhập phần tử thứ" + i + ":");
			A[i] = scanner.nextInt();
		}

		System.out.println("Nhập số nnguyen6 k:");
		int k = scanner.nextInt();
		
		//Xóa phần tử k ra khỏi mảng
		//Vòng lặp for sẽ khởi tạo c=i=0
		//và duyệt i từ 0 đến n
		//nếu phần tử tại vị trí i khác với số nguyên k
		//thì gắn phần tử tại i cho phần tử tại k
		//sau đó tăng c lên 1
		for(c=i=0; i<n; i++) {
			if(A[i] != k) {
				A[c] = A[i];
				c++;
			}
		}
		n = c ; //lúc naày số phần tử trong mảng sẽ bằng c
		
		//Hiển thị các phần tử trong mảng sau khi xóa k
		System.out.println("Mảng còn lại sau khi xóa phần tử" + k+ "là:");
		for(i = 0; i<n; i++) {
			System.out.print(A[i] + "\t");
		}
	}

}
