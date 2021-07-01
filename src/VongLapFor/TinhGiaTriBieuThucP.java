package VongLapFor;

import java.util.Scanner;

public class TinhGiaTriBieuThucP {

	public static void main(String[] args) {
		int n;
		long result = 1;
		Scanner scanner = new Scanner(System.in);
		
		// n còn nhỏ hơn 0 thì còn nhập lại
		do {
			System.out.println("Mời bạn nhập vào số n:");
			n = scanner.nextInt();
		}while(n < 0);
		
		//Tính giá trị của biểu thức
		for(int i =0; i<=n; i++) {
			result *= (2*i+1);
		}
		System.out.println("Kết quả = " + result);

	}

}
