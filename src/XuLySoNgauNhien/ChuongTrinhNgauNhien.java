package XuLySoNgauNhien;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ChuongTrinhNgauNhien {

	public static void main(String[] args) {
		int n, number;
		Random rdRandom = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập số phần tử của arrList:");
		n = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			number = 3 + rdRandom.nextInt(298);
			arrayList.add(number);
			
		}
		for(int i=0; i<n; i++) {
			if(arrayList.get(i)%3 ==0) {
				System.out.print(arrayList.get(i) + "\t");
			}
		}

	}

}
