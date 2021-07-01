package VongLapWhile;

import java.util.Scanner;

public class TinhTongCacSoNguyen {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Bắt đầu vòng lặp
		//Kiểm tra nếu biến sum còn nhỏ hơn 100 thì con thực hiện
		while(sum < 100) {
			System.out.println("Nhập vào số nguyên bất kỳ:");
			number = scanner.nextInt();
			sum += number; //sum = sum + number;
		}
		System.out.println("Tổng các số nguyên vừa nhập = " + sum);

	}

}
