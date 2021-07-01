package MangMotChieu;

import java.util.Scanner;

public class TachSoChanSoLe {

	public static void main(String[] args) {
		int n, c, d;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số phần tử của mảng:");
			n = scanner.nextInt();
		}while (n <=0);
		
		int A[] = new int[n];
		int ch[] = new int[n];// Mảng chứa phần tử là số chẵn
		int le[] = new int[n]; //Mảng chứa các phần từ là số lẻ
		
		System.out.println("Nhập các phần tử cho mảng:");
		for(int i =0; i<n; i++) {
			System.out.println("Nhập phần tử thứ" + i+":");
			A[i] = scanner.nextInt();
		}
		//c: số phần tử của mảng chẵn
		//d: số phần tử của mảng lẻ
		c=d=0;
		for(int i =0; i<n; i++) {
			//nếu phần tử tại vị trí i chia hết cho 2
			//thì gắn phần tử đó cho phần tử tại vị trí c của mảng chẵn
			//ngược lại thì gắn phần tử đó
			//cho phần tử tại vị trí d của mảng lẻ
			if(A[i] %2 ==0) {
				ch[c] = A[i];
				c++;
			}else {
				le[d] = A[i];
				c++;
		}
		

	}

		System.out.println("Các phần tử của mảng chẵn là:");
		for(int i = 0; i<c; i++) {
			System.out.print(ch[i] + "\t");
		}
		System.out.println("Các phần tử của mảng lẻ là:");
		for(int i =0; i<d; i++) {
			System.out.println(le[i] + "\t");
		}
}
}