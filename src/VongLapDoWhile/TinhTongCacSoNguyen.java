package VongLapDoWhile;

import java.util.Scanner;

public class TinhTongCacSoNguyen {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		//Bắt đầu vòng lặp
		//Điều kiện sum < 100 chỉ được thực hiện sau khi thân vòng lặp đã được thực hiện
		do {
			System.out.println("Nhập vào số nguyên bất kỳ");
			number = scanner.nextInt();
			//sum = sum + number;
			sum += number;
		}while(sum < 100);
		
		System.out.println("Tổng các số nguyên vừa nhập =" + sum);

	}

}
