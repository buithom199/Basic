package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TongCacPhanTuTrongArrayList {

	public static void main(String[] args) {
		int n;
		double number, sum =0;
		ArrayList<Double> arrayListDouble = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số phần tử của ArrayList");
		n = scanner.nextInt();
		
		for(int i =0; i<n; i++) {
			System.out.print("Nhập phần tử thứ" + i + ":");
			number = scanner.nextDouble();
			arrayListDouble.add(number);
		}
		
		//tính tổng các phần tử của arrListDouble
		for(double element: arrayListDouble) {
			sum += element;
		}
		System.out.println("Tổng của các phần tử trong arrListDouble=" + sum);

	}

}
