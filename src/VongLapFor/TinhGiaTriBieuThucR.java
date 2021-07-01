package VongLapFor;

import java.util.Scanner;

public class TinhGiaTriBieuThucR {

	public static void main(String[] args) {
		int n, sum=0;
		Scanner scanner = new Scanner(System.in);
		
		//n còn nhỏ hơn 1 thì còn nhập lại
		do {
			System.out.println("Mời nhập vào số n");
			n = scanner.nextInt();
		}while (n<1);
		
		//Tính giá trị của biểu thức
		// i còn nhỏ hoặc bằng n thì còn thực hiện vòng lặp thân
		for(int i = 1; i <= n; i++) {
			int temp = 1;
			//Duyệt j từ 1 đến khi j còn nhỏ hơn hoặc bằng i
			for(int j = 1; j <=i; j++) {
				temp *= i;
			}
			sum += temp;
		}
		System.out.println("Tổng= " + sum);

	}

}
