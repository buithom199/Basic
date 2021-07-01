package ChuoiString;

import java.util.Scanner;

public class Vidu04 {

	public static void main(String[] args) {
		int lineNumber;
		String chuoi = "Alarm!";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số nguyên bất kỳ:");
			lineNumber = scanner.nextInt();
		}while (lineNumber < 1);
		for(int i =0; i< lineNumber;i++) {
			System.out.println(chuoi);
		}
	}

}
