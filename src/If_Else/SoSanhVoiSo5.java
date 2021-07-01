package If_Else;

import java.util.Scanner;

public class SoSanhVoiSo5 {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số cần so sánh");
		number = scanner.nextInt();
		if(number>5) {
			System.out.println("Số" + number + "lớn hơn 5");
		}else {
			System.out.println("Số" + number + "nhỏ hơn 5");
		}

	}

}
