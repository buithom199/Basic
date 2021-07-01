package XuLyMath;

import java.util.Scanner;

public class PhuongThucMath02 {

	public static void main(String[] args) {
		double firstNumber, secondNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số thứ nhất:");
		firstNumber =scanner.nextDouble();
		System.out.println("Nhập vào số thứ hai:");
		secondNumber = scanner.nextDouble();
		
		//tìm số nhỏ nhất giữa 2 số firstNamber và secondNumber
		//sử dụng phương thức Math.min()
		double minNumber = Math.min(firstNumber, secondNumber);
		System.out.println("Số nhỏ nhất trong 2 số" + firstNumber + "và"
				+ secondNumber + "là" + minNumber);

	}

}
