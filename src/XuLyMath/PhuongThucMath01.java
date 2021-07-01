package XuLyMath;

import java.util.Scanner;

public class PhuongThucMath01 {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào số thứ nhất:");
		firstNumber = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai");
		secondNumber =scanner.nextInt();
		
		//tìm số lớn nhất giữa 2 số firstNumber và seconNumber
		//sử dụng phương thức Math.max()
		int maxNumber = Math.max(firstNumber, secondNumber);
		System.out.println("Số lớn nhất trong 2 số" + firstNumber + "và"
				+ secondNumber + "là" + maxNumber);

	}

}
