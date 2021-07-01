package Switch_Case;

import java.util.Scanner;

public class HienThiChuoiSoTuongUng {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào 1 số bất kỳ");
		number = scanner.nextInt();
		
		switch (number) {
		case 0:
			System.out.println("Số 0");
			break;
		case 1:
		case 2:
			System.out.println("Số nhỏ");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Số trung bình");
			break;

		default:
			System.out.println("Số lớn");
		}
		

	}

}
