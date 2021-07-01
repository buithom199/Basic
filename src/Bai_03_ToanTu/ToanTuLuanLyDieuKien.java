package Bai_03_ToanTu;

import java.util.Scanner;

public class ToanTuLuanLyDieuKien {

	public static void main(String[] args) {
		int firstNumber, secondNumber;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất:");
		firstNumber = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai:");
		secondNumber = scanner.nextInt();
		
		//Sử dụng toán tử luận lý điều kiện
		//Toán tử AND
		System.out.println("Kết quả của (firstNumber < 10) && (secondNumber < 10) là" +
		((firstNumber < 10) && (secondNumber< 10)));
		
		//Toán tử OR
		System.out.println("Kết quả của (firstNumber < 10) || (secondNumber < 10) là" +
		((firstNumber<10) || (secondNumber < 10)));
		
		

	}

}
